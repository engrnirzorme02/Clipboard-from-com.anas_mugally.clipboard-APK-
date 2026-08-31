package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;
import p012B2.InterfaceC0064e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpp implements InterfaceC0064e {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final boolean zzg;

    public zzbpp(Date date, int i7, Set set, Location location, boolean z7, int i8, boolean z8, int i9, String str) {
        this.zza = date;
        this.zzb = i7;
        this.zzc = set;
        this.zze = location;
        this.zzd = z7;
        this.zzf = i8;
        this.zzg = z8;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // p012B2.InterfaceC0064e
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // p012B2.InterfaceC0064e
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    @Override // p012B2.InterfaceC0064e
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // p012B2.InterfaceC0064e
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}
