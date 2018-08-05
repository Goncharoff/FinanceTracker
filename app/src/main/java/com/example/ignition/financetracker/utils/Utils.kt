package com.example.ignition.financetracker.utils

import android.content.Context
import android.widget.ArrayAdapter
import java.math.BigDecimal
import java.text.DateFormat
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

object Utils {
    val dateFormatter = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT, Locale.getDefault())

    private val decimalFormatter = DecimalFormat("0.00")

    fun formatDecimalNumber(value: BigDecimal): String {
        return decimalFormatter.format(value)
    }

    fun formatDecimalNumber(value: Double): String {
        return formatDecimalNumber(BigDecimal.valueOf(value))
    }

    fun makeNegativeDecimal(d: String, isNegative: Boolean): BigDecimal {
        val res = BigDecimal(d)
        return if (isNegative) res.negate() else res
    }

    fun <T> createAdapterWith(ctx: Context?,
                              resource: Int = android.R.layout.simple_spinner_dropdown_item): ArrayAdapter<T> {
        return ArrayAdapter(ctx, resource)
    }

    fun <T> createAdapterWithValues(ctx: Context?,
                                    values: Array<T>,
                                    resource: Int = android.R.layout.simple_spinner_dropdown_item): ArrayAdapter<T> {
        return ArrayAdapter(ctx, resource, values)
    }
}