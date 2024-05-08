package com.test.rest.webservices.exercisejson_api.services;

import com.test.rest.webservices.exercisejson_api.models.Hmc;
import com.test.rest.webservices.exercisejson_api.models.Machine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.List;


@RequiredArgsConstructor
@Slf4j
public class MachineService {


    private final RestTemplate restTemplate;

    public void getDataAndService() {
        log.info("start getting JSON from server");
        Machine response = restTemplate.getForObject("https://q11.jvmhost.net/hmc_", Machine.class);
        List<Hmc> hmcs = response.getEmbedded().getHmcs();

        hmcs.sort(new Comparator<Hmc>() {
            @Override
            public int compare(Hmc o1, Hmc o2) {
                Integer x1 = o1.getX();
                Integer x2 = o2.getX();
                return x2.compareTo(x1);
            }
        });
        hmcs.forEach(System.out::println);

    }
}
