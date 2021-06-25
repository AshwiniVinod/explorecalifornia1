package com.example.ec.service;

import com.example.ec.domain.TourPackage;
import com.example.ec.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    /*Creates the Tour Package and Save it to DB*/
    public TourPackage createTourPackage(String code,String name){
        return tourPackageRepository.findById(code).orElse(tourPackageRepository.save(new TourPackage(code,name)));
    }

    /*Returns the list of all the tour packages*/
    public Iterable<TourPackage> lookUpTourPackage(){
        return tourPackageRepository.findAll();
    }
    /*total number of packes*/
    public long total(){
        return tourPackageRepository.count();
    }
}
