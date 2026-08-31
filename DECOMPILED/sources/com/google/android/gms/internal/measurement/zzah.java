package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah implements zzao {
    private final Double zza;

    public zzah(Double d7) {
        if (d7 == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d7;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzah) {
            return this.zza.equals(((zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        Double d7 = this.zza;
        if (Double.isNaN(d7.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d7.doubleValue())) {
            return d7.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalM18382a = AbstractC3933a.m18382a(BigDecimal.valueOf(d7.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalM18382a.scale() > 0 ? bigDecimalM18382a.precision() : bigDecimalM18382a.scale()) - 1);
        String str = decimalFormat.format(bigDecimalM18382a);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i7 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i7 >= 0 || i7 <= -7) && (i7 < 0 || i7 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalM18382a.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        if ("toString".equals(str)) {
            return new zzas(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzc(), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        Double d7 = this.zza;
        boolean z7 = false;
        if (!Double.isNaN(d7.doubleValue()) && d7.doubleValue() != 0.0d) {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzah(this.zza);
    }
}
