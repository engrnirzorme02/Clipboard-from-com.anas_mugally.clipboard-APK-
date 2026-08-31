package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.C3391s0;
import com.google.android.gms.ads.internal.client.C3393s2;
import com.google.android.gms.ads.internal.client.InterfaceC3375o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p340r2.C6883a;
import p340r2.C6887e;
import p340r2.C6889g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdc {
    public final C3321a2 zza;
    public final zzblw zzb;
    public final zzeli zzc;
    public final C3349h2 zzd;
    public final Bundle zze;
    public final C3369m2 zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbfl zzj;
    public final C3393s2 zzk;
    public final int zzl;
    public final C6883a zzm;
    public final C6889g zzn;
    public final InterfaceC3375o0 zzo;
    public final zzfcq zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final C3391s0 zzv;

    /* synthetic */ zzfdc(zzfdb zzfdbVar, byte[] bArr) {
        this.zzf = zzfdbVar.zzD();
        this.zzg = zzfdbVar.zzE();
        this.zzv = zzfdbVar.zzY();
        this.zze = zzfdbVar.zzC().f13948M;
        C3349h2 c3349h2ZzC = zzfdbVar.zzC();
        C3349h2 c3349h2ZzC2 = zzfdbVar.zzC();
        C3349h2 c3349h2ZzC3 = zzfdbVar.zzC();
        C3349h2 c3349h2ZzC4 = zzfdbVar.zzC();
        C3349h2 c3349h2ZzC5 = zzfdbVar.zzC();
        C3349h2 c3349h2ZzC6 = zzfdbVar.zzC();
        C3349h2 c3349h2ZzC7 = zzfdbVar.zzC();
        int i7 = zzfdbVar.zzC().f13949a;
        long j7 = c3349h2ZzC7.f13950b;
        Bundle bundle = c3349h2ZzC6.f13951c;
        int i8 = c3349h2ZzC5.f13952d;
        List list = c3349h2ZzC4.f13953e;
        boolean z7 = c3349h2ZzC3.f13954f;
        int i9 = c3349h2ZzC2.f13955r;
        boolean z8 = true;
        if (!c3349h2ZzC.f13956s && !zzfdbVar.zzG()) {
            z8 = false;
        }
        C3349h2 c3349h2 = new C3349h2(i7, j7, bundle, i8, list, z7, i9, z8, zzfdbVar.zzC().f13957t, zzfdbVar.zzC().f13958u, zzfdbVar.zzC().f13959v, zzfdbVar.zzC().f13960w, zzfdbVar.zzC().f13961x, zzfdbVar.zzC().f13962y, zzfdbVar.zzC().f13963z, zzfdbVar.zzC().f13936A, zzfdbVar.zzC().f13937B, zzfdbVar.zzC().f13938C, zzfdbVar.zzC().f13939D, zzfdbVar.zzC().f13940E, zzfdbVar.zzC().f13941F, zzfdbVar.zzC().f13942G, C3431F0.m17385A(zzfdbVar.zzC().f13943H), zzfdbVar.zzC().f13944I, zzfdbVar.zzC().f13945J, zzfdbVar.zzC().f13946K, zzfdbVar.zzC().f13947L);
        this.zzd = c3349h2;
        this.zza = zzfdbVar.zzF() != null ? zzfdbVar.zzF() : zzfdbVar.zzJ() != null ? zzfdbVar.zzJ().zzf : null;
        this.zzh = zzfdbVar.zzH();
        this.zzi = zzfdbVar.zzI();
        this.zzj = zzfdbVar.zzH() == null ? null : zzfdbVar.zzJ() == null ? new zzbfl(new C6887e.a().m30097a()) : zzfdbVar.zzJ();
        this.zzk = zzfdbVar.zzK();
        this.zzl = zzfdbVar.zzO();
        this.zzm = zzfdbVar.zzL();
        this.zzn = zzfdbVar.zzM();
        this.zzo = zzfdbVar.zzN();
        this.zzb = zzfdbVar.zzP();
        this.zzp = new zzfcq(zzfdbVar.zzQ(), null);
        this.zzq = zzfdbVar.zzR();
        this.zzr = zzfdbVar.zzS();
        this.zzc = zzfdbVar.zzT();
        this.zzs = zzfdbVar.zzU();
        this.zzt = zzfdbVar.zzV();
        this.zzu = c3349h2.f13947L != 0 ? new AtomicLong(c3349h2.f13947L) : zzfdbVar.zzW();
    }

    public final boolean zza() {
        return this.zzg.matches((String) C3250D.m17200c().zzd(zzbci.zzdE));
    }
}
