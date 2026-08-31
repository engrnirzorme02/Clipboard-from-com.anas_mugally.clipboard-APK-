package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.ArrayList;
import p033E.C0247b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenb implements zzeun {
    public final C3369m2 zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;
    public final C0247b zzj;

    public zzenb(C3369m2 c3369m2, String str, boolean z7, String str2, float f7, int i7, int i8, String str3, boolean z8, C0247b c0247b) {
        AbstractC3718s.m18084m(c3369m2, "the adSize must not be null");
        this.zza = c3369m2;
        this.zzb = str;
        this.zzc = z7;
        this.zzd = str2;
        this.zze = f7;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = str3;
        this.zzi = z8;
        this.zzj = c0247b;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00af  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b3  */
    private final void zzc(Bundle bundle) {
        C0247b c0247b;
        C3369m2 c3369m2 = this.zza;
        int i7 = c3369m2.f14026e;
        zzfdr.zzb(bundle, "smart_w", "full", i7 == -1);
        int i8 = c3369m2.f14023b;
        zzfdr.zzb(bundle, "smart_h", "auto", i8 == -2);
        zzfdr.zzd(bundle, "ene", true, c3369m2.f14031u);
        zzfdr.zzb(bundle, "rafmt", "102", c3369m2.f14034x);
        zzfdr.zzb(bundle, "rafmt", "103", c3369m2.f14035y);
        zzfdr.zzb(bundle, "rafmt", "105", c3369m2.f14036z);
        zzfdr.zzd(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfdr.zzd(bundle, "interscroller_slot", true, c3369m2.f14036z);
        zzfdr.zze(bundle, "format", this.zzb);
        zzfdr.zzb(bundle, "fluid", "height", this.zzc);
        String str = this.zzd;
        zzfdr.zzb(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzfdr.zzb(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoe)).booleanValue()) {
            c0247b = this.zzj;
            if (c0247b != null) {
                bundle.putInt("sam_t", c0247b.f985b);
                bundle.putInt("sam_b", c0247b.f987d);
                bundle.putInt("sam_l", c0247b.f984a);
                bundle.putInt("sam_r", c0247b.f986c);
            }
        } else if (((Boolean) C3250D.m17200c().zzd(zzbci.zzof)).booleanValue()) {
            c0247b = this.zzj;
            if (c0247b != null) {
                bundle.putInt("sam_t", c0247b.f985b);
                bundle.putInt("sam_b", c0247b.f987d);
                bundle.putInt("sam_l", c0247b.f984a);
                bundle.putInt("sam_r", c0247b.f986c);
            }
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        C3369m2[] c3369m2Arr = c3369m2.f14028r;
        if (c3369m2Arr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i8);
            bundle2.putInt("width", i7);
            bundle2.putBoolean("is_fluid_height", c3369m2.f14030t);
            arrayList.add(bundle2);
        } else {
            for (C3369m2 c3369m3 : c3369m2Arr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", c3369m3.f14030t);
                bundle3.putInt("height", c3369m3.f14023b);
                bundle3.putInt("width", c3369m3.f14026e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcuu) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcuu) obj).zzb);
    }
}
