package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3250D;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfey extends AbstractC1945a {
    public static final Parcelable.Creator<zzfey> CREATOR = new zzfez();
    public final Context zza;
    public final zzfev zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfev[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfey(int i7, int i8, int i9, int i10, String str, int i11, int i12) {
        zzfev[] zzfevVarArrValues = zzfev.values();
        this.zzh = zzfevVarArrValues;
        int[] iArrZza = zzfew.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfex.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i7;
        this.zzb = zzfevVarArrValues[i7];
        this.zzc = i8;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = str;
        this.zzj = i11;
        this.zzg = iArrZza[i11];
        this.zzk = i12;
        int i13 = iArrZza2[i12];
    }

    public static zzfey zza(zzfev zzfevVar, Context context) {
        if (zzfevVar == zzfev.Rewarded) {
            return new zzfey(context, zzfevVar, ((Integer) C3250D.m17200c().zzd(zzbci.zzgM)).intValue(), ((Integer) C3250D.m17200c().zzd(zzbci.zzgS)).intValue(), ((Integer) C3250D.m17200c().zzd(zzbci.zzgU)).intValue(), (String) C3250D.m17200c().zzd(zzbci.zzgW), (String) C3250D.m17200c().zzd(zzbci.zzgO), (String) C3250D.m17200c().zzd(zzbci.zzgQ));
        }
        if (zzfevVar == zzfev.Interstitial) {
            return new zzfey(context, zzfevVar, ((Integer) C3250D.m17200c().zzd(zzbci.zzgN)).intValue(), ((Integer) C3250D.m17200c().zzd(zzbci.zzgT)).intValue(), ((Integer) C3250D.m17200c().zzd(zzbci.zzgV)).intValue(), (String) C3250D.m17200c().zzd(zzbci.zzgX), (String) C3250D.m17200c().zzd(zzbci.zzgP), (String) C3250D.m17200c().zzd(zzbci.zzgR));
        }
        if (zzfevVar != zzfev.AppOpen) {
            return null;
        }
        return new zzfey(context, zzfevVar, ((Integer) C3250D.m17200c().zzd(zzbci.zzha)).intValue(), ((Integer) C3250D.m17200c().zzd(zzbci.zzhc)).intValue(), ((Integer) C3250D.m17200c().zzd(zzbci.zzhd)).intValue(), (String) C3250D.m17200c().zzd(zzbci.zzgY), (String) C3250D.m17200c().zzd(zzbci.zzgZ), (String) C3250D.m17200c().zzd(zzbci.zzhb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zzi;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8072t(parcel, 2, this.zzc);
        AbstractC1947c.m8072t(parcel, 3, this.zzd);
        AbstractC1947c.m8072t(parcel, 4, this.zze);
        AbstractC1947c.m8044E(parcel, 5, this.zzf, false);
        AbstractC1947c.m8072t(parcel, 6, this.zzj);
        AbstractC1947c.m8072t(parcel, 7, this.zzk);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    private zzfey(Context context, zzfev zzfevVar, int i7, int i8, int i9, String str, String str2, String str3) {
        int i10;
        this.zzh = zzfev.values();
        this.zzl = zzfew.zza();
        this.zzm = zzfex.zza();
        this.zza = context;
        this.zzi = zzfevVar.ordinal();
        this.zzb = zzfevVar;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i10 = 1;
        } else {
            i10 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i10;
        this.zzj = i10 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
