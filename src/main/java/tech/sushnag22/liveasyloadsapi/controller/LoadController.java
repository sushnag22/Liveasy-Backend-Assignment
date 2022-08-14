package tech.sushnag22.liveasyloadsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.sushnag22.liveasyloadsapi.model.Load;
import tech.sushnag22.liveasyloadsapi.service.LoadService;

@RestController
public class LoadController {
    @Autowired
    LoadService loadService;

    @GetMapping("/load/{loadId}")
    private Load getLoadById(@PathVariable("loadId") int loadId) {
        return loadService.getLoadById(loadId);
    }

    @GetMapping("/load")
    private Load getLoadByShipperId(@RequestParam(name = "shipperId") int shipperId) {
        return loadService.getLoadByShipperId(shipperId);
    }

    @PostMapping("/load")
    private Load saveLoad(@RequestBody Load load) {
        loadService.save(load);
        return load;
    }

    @PutMapping("/load/{loadId}")
    private String updateLoad(@RequestBody Load load, @PathVariable("loadId") int loadId) {
        loadService.update(load, loadId);
        return "Load with ID " + loadId + " is updated successfully!";
    }

    @DeleteMapping("/load/{loadId}")
    private String deleteLoad (@PathVariable("loadId") int loadId) {
        loadService.delete(loadId);
        return "Load with ID " + loadId + " is deleted successfully!";
    }

}