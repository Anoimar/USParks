package com.thernat.mapcompare.adapter

import androidx.databinding.BindingAdapter
import com.thernat.mapcompare.data.ParkMapData
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.CustomZoomButtonsController
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker

@BindingAdapter("parkMarker")
fun bindsParkMarker(mapView: MapView, parkMapData: ParkMapData) {
    val parkLocation = GeoPoint(parkMapData.latitude, parkMapData.longitude)
    with(mapView) {
        setTileSource(TileSourceFactory.MAPNIK)
        zoomController.setVisibility(CustomZoomButtonsController.Visibility.ALWAYS)
        setMultiTouchControls(true)
        controller.setZoom(13.toDouble())
        controller.setCenter(parkLocation)
    }
    with(Marker(mapView)) {
        position = parkLocation
        setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        mapView.overlays.add(this)

    }
}