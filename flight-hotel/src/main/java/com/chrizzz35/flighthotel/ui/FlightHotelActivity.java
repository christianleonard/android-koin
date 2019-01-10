package com.chrizzz35.flighthotel.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.chrizzz35.flighthotel.R;
import kotlin.Lazy;

import static org.koin.java.standalone.KoinJavaComponent.inject;

public class FlightHotelActivity extends AppCompatActivity {

    private Lazy<FlightHotelPresenter> presenter = inject(FlightHotelPresenter.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_hotel);

        presenter.getValue().setViewModel(new FlightHotelViewModel());

        if(presenter.getValue().getViewModel().flightList.size() == 0 || presenter.getValue().getViewModel().hotelList.size() == 0) {
            presenter.getValue().initFlightHotelData();
        }
    }
}
