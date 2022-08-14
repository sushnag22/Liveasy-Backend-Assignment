package tech.sushnag22.liveasyloadsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import tech.sushnag22.liveasyloadsapi.model.Load;
import tech.sushnag22.liveasyloadsapi.repository.LoadRepository;

@Service
public class LoadService {
    @Autowired
    private LoadRepository loadRepository;

    public Load getLoadById(int id) {
        return loadRepository.findById(id).get();
    }

    public Load getLoadByShipperId(@RequestParam(name = "shipperId") int shipperId) {
        return loadRepository.findById(shipperId).get();
    }

    public void save(Load load) {
        loadRepository.save(load);
    }

    public void delete(int id) {
        loadRepository.deleteById(id);
    }

    public void update(Load load, int id) {
        Load l = getLoadById(id);
        l.setLoadingPoint(load.getLoadingPoint());
        l.setUnloadingPoint(load.getUnloadingPoint());
        l.setProductType(load.getProductType());
        l.setTruckType(load.getTruckType());
        l.setNoOfTrucks(load.getNoOfTrucks());
        l.setWeight(load.getWeight());
        l.setComment(load.getComment());
        l.setShipperId(load.getShipperId());
        l.setDate(load.getDate());
        loadRepository.save(l);
    }
}