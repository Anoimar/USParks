package com.thernat.mapcompare.data

import android.os.Parcel
import android.os.Parcelable

data class ParkMapData(
    val name: String?,
    val longitude: Double,
    val latitude: Double
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble(),
        parcel.readDouble()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeDouble(longitude)
        parcel.writeDouble(latitude)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ParkMapData> {
        override fun createFromParcel(parcel: Parcel): ParkMapData {
            return ParkMapData(parcel)
        }

        override fun newArray(size: Int): Array<ParkMapData?> {
            return arrayOfNulls(size)
        }
    }
}