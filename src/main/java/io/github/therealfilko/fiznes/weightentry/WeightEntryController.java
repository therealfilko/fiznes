package io.github.therealfilko.fiznes.weightentry;

import io.github.therealfilko.fiznes.weightentry.dto.CreateWeightEntryRequest;
import io.github.therealfilko.fiznes.weightentry.dto.UpdateWeightEntryRequest;
import io.github.therealfilko.fiznes.weightentry.dto.WeightEntryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weights")
public class WeightEntryController {
    private final WeightEntryService weightEntryService;

    public WeightEntryController(WeightEntryService weightEntryService) {
        this.weightEntryService = weightEntryService;
    }

    @GetMapping("/")
    public List<WeightEntryResponse> getWeightEntries() {
        return weightEntryService.getAllWeightEntries();
    }

    @GetMapping("/{id}")
    public WeightEntryResponse getWeightById(@PathVariable Integer id) {
        return weightEntryService.getWeightById(id);
    }

    @PostMapping
    public String createNewWeightentry(@RequestBody CreateWeightEntryRequest request) {
        weightEntryService.createNewWeightEntry(request);
        return "Gewicht eingetragen!";
    }

    @PutMapping("/{id}")
    public WeightEntryResponse updateWeightEntryById(@PathVariable Integer id, @RequestBody UpdateWeightEntryRequest request) {
        return weightEntryService.updateWeightEntryById(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteWeightEntryById(@PathVariable Integer id) {
        weightEntryService.deleteWeightEntryById(id);
    }
}