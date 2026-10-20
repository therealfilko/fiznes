package io.github.therealfilko.fiznes.weightentry;

import io.github.therealfilko.fiznes.weightentry.dto.CreateWeightEntryRequest;
import io.github.therealfilko.fiznes.weightentry.dto.UpdateWeightEntryRequest;
import io.github.therealfilko.fiznes.weightentry.dto.WeightEntryResponse;
import org.hibernate.persister.entity.SingleTableEntityPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeightEntryService {
    private final WeightEntryRepository weightEntryRepository;

    public WeightEntryService(WeightEntryRepository weightEntryRepository) {
        this.weightEntryRepository = weightEntryRepository;
    }

    private WeightEntry findEntityById(Integer id) {
        Optional<WeightEntry> entityOptional = weightEntryRepository.findById(id);

        if (entityOptional.isPresent()) {
            return entityOptional.get();
        }
        throw new RuntimeException("Kein Eintrag gefunden!");
    }

    private WeightEntryResponse mapToResponse(WeightEntry entity) {
        return new WeightEntryResponse(entity.getId(), entity.getDatum(), entity.getGewicht());
    }

    public List<WeightEntryResponse> getAllWeightEntries() {
        List<WeightEntry> entities = weightEntryRepository.findAll();
        return entities.stream().map(entry ->
                        mapToResponse(entry)).toList();
   }

    public WeightEntryResponse getWeightById(Integer id) {
        return mapToResponse(findEntityById(id));
    }

    public WeightEntryResponse createNewWeightEntry(CreateWeightEntryRequest request) {
        WeightEntry entity = new WeightEntry();
        entity.setDatum(request.datum());
        entity.setGewicht(request.gewicht());
        return mapToResponse(weightEntryRepository.save(entity));
    }

    public WeightEntryResponse updateWeightEntryById(Integer id, UpdateWeightEntryRequest request) {
        WeightEntry entity = findEntityById(id);
        entity.setDatum(request.datum());
        entity.setGewicht(request.gewicht());
        return mapToResponse(weightEntryRepository.save(entity));
    }

    public void deleteWeightEntryById(Integer id) {
       weightEntryRepository.delete(findEntityById(id));
    }
}
