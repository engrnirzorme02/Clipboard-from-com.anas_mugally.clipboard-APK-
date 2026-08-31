package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpq {
    public static final zzhpq zzj = new zzhpq(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhpq zzk = new zzhpq(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhpq zzl = new zzhpq(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhpq zzm = new zzhpq(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;

    public zzhpq(double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.zza = d11;
        this.zzb = d12;
        this.zzc = d13;
        this.zzd = d7;
        this.zze = d8;
        this.zzf = d9;
        this.zzg = d10;
        this.zzh = d14;
        this.zzi = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzhpq.class != obj.getClass()) {
            return false;
        }
        zzhpq zzhpqVar = (zzhpq) obj;
        return Double.compare(zzhpqVar.zzd, this.zzd) == 0 && Double.compare(zzhpqVar.zze, this.zze) == 0 && Double.compare(zzhpqVar.zzf, this.zzf) == 0 && Double.compare(zzhpqVar.zzg, this.zzg) == 0 && Double.compare(zzhpqVar.zzh, this.zzh) == 0 && Double.compare(zzhpqVar.zzi, this.zzi) == 0 && Double.compare(zzhpqVar.zza, this.zza) == 0 && Double.compare(zzhpqVar.zzb, this.zzb) == 0 && Double.compare(zzhpqVar.zzc, this.zzc) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zza);
        long j7 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zzb);
        long j8 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zzc);
        long j9 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.zzd);
        long j10 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.zze);
        long j11 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.zzf);
        long j12 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.zzg);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.zzh);
        long j13 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.zzi);
        return (((((((((((((((((int) j7) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j13)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zzj)) {
            return "Rotate 0°";
        }
        if (equals(zzk)) {
            return "Rotate 90°";
        }
        if (equals(zzl)) {
            return "Rotate 180°";
        }
        if (equals(zzm)) {
            return "Rotate 270°";
        }
        double d7 = this.zza;
        double d8 = this.zzb;
        double d9 = this.zzc;
        double d10 = this.zzd;
        double d11 = this.zze;
        double d12 = this.zzf;
        double d13 = this.zzg;
        double d14 = this.zzh;
        double d15 = this.zzi;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d7);
        sb.append(", v=");
        sb.append(d8);
        sb.append(", w=");
        sb.append(d9);
        sb.append(", a=");
        sb.append(d10);
        sb.append(", b=");
        sb.append(d11);
        sb.append(", c=");
        sb.append(d12);
        sb.append(", d=");
        sb.append(d13);
        sb.append(", tx=");
        sb.append(d14);
        sb.append(", ty=");
        sb.append(d15);
        sb.append("}");
        return sb.toString();
    }
}
