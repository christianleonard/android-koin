package com.chrizzz35.flighthotel.ui;

import com.chrizzz35.flightapi.FlightProvider;
import com.chrizzz35.hotelapi.HotelProvider;

/**
 * Created by christian.leonard on 1/10/19
 */

public class FlightHotelPresenter {
    private FlightHotelViewModel viewModel;
    private FlightProvider flightProvider;
    private HotelProvider hotelProvider;

    public FlightHotelPresenter(FlightProvider flightProvider, HotelProvider hotelProvider) {
        this.flightProvider = flightProvider;
        this.hotelProvider = hotelProvider;
    }

    public void initFlightHotelData() {
        viewModel.flightList = flightProvider.getFlightList();
        viewModel.hotelList = hotelProvider.getHotelList();
    }

    public void setViewModel(FlightHotelViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public FlightHotelViewModel getViewModel() {
        return viewModel;
    }
}
