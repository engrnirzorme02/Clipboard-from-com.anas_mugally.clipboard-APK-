package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.C3391s0;
import com.google.android.gms.ads.internal.client.C3393s2;
import com.google.android.gms.ads.internal.client.InterfaceC3375o0;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p340r2.C6883a;
import p340r2.C6889g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdb {
    private C3349h2 zza;
    private C3369m2 zzb;
    private String zzc;
    private C3321a2 zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbfl zzh;
    private C3393s2 zzi;
    private C6883a zzj;
    private C6889g zzk;
    private InterfaceC3375o0 zzl;
    private zzblw zzn;
    private zzeli zzr;
    private Bundle zzt;
    private C3391s0 zzv;
    private int zzm = 1;
    private final zzfcp zzo = new zzfcp();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();

    public final boolean zzA() {
        return this.zzp;
    }

    public final boolean zzB() {
        return this.zzq;
    }

    final /* synthetic */ C3349h2 zzC() {
        return this.zza;
    }

    final /* synthetic */ C3369m2 zzD() {
        return this.zzb;
    }

    final /* synthetic */ String zzE() {
        return this.zzc;
    }

    final /* synthetic */ C3321a2 zzF() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzG() {
        return this.zze;
    }

    final /* synthetic */ ArrayList zzH() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzI() {
        return this.zzg;
    }

    final /* synthetic */ zzbfl zzJ() {
        return this.zzh;
    }

    final /* synthetic */ C3393s2 zzK() {
        return this.zzi;
    }

    final /* synthetic */ C6883a zzL() {
        return this.zzj;
    }

    final /* synthetic */ C6889g zzM() {
        return this.zzk;
    }

    final /* synthetic */ InterfaceC3375o0 zzN() {
        return this.zzl;
    }

    final /* synthetic */ int zzO() {
        return this.zzm;
    }

    final /* synthetic */ zzblw zzP() {
        return this.zzn;
    }

    final /* synthetic */ zzfcp zzQ() {
        return this.zzo;
    }

    final /* synthetic */ boolean zzR() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzS() {
        return this.zzq;
    }

    final /* synthetic */ zzeli zzT() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzU() {
        return this.zzs;
    }

    final /* synthetic */ Bundle zzV() {
        return this.zzt;
    }

    final /* synthetic */ AtomicLong zzW() {
        return this.zzu;
    }

    public final zzfdb zzX(C3391s0 c3391s0) {
        this.zzv = c3391s0;
        return this;
    }

    final /* synthetic */ C3391s0 zzY() {
        return this.zzv;
    }

    public final zzfdb zza(C3349h2 c3349h2) {
        this.zza = c3349h2;
        return this;
    }

    public final C3349h2 zzb() {
        return this.zza;
    }

    public final zzfdb zzc(C3369m2 c3369m2) {
        this.zzb = c3369m2;
        return this;
    }

    public final zzfdb zzd(boolean z7) {
        this.zzp = z7;
        return this;
    }

    public final zzfdb zze(boolean z7) {
        this.zzq = z7;
        return this;
    }

    public final C3369m2 zzf() {
        return this.zzb;
    }

    public final zzfdb zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzfdb zzi(C3321a2 c3321a2) {
        this.zzd = c3321a2;
        return this;
    }

    public final zzfcp zzj() {
        return this.zzo;
    }

    public final zzfdb zzk(boolean z7) {
        this.zze = z7;
        return this;
    }

    public final zzfdb zzl(int i7) {
        this.zzm = i7;
        return this;
    }

    public final zzfdb zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfdb zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfdb zzo(zzbfl zzbflVar) {
        this.zzh = zzbflVar;
        return this;
    }

    public final zzfdb zzp(C3393s2 c3393s2) {
        this.zzi = c3393s2;
        return this;
    }

    public final zzfdb zzq(zzblw zzblwVar) {
        this.zzn = zzblwVar;
        this.zzd = new C3321a2(false, true, false);
        return this;
    }

    public final zzfdb zzr(C6889g c6889g) {
        this.zzk = c6889g;
        if (c6889g != null) {
            this.zze = c6889g.zza();
            this.zzl = c6889g.m30112T();
        }
        return this;
    }

    public final zzfdb zzs(C6883a c6883a) {
        this.zzj = c6883a;
        if (c6883a != null) {
            this.zze = c6883a.m30089T();
        }
        return this;
    }

    public final zzfdb zzt(zzeli zzeliVar) {
        this.zzr = zzeliVar;
        return this;
    }

    public final zzfdb zzu(boolean z7) {
        this.zzs = true;
        return this;
    }

    public final zzfdb zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzfdb zzx(long j7) {
        this.zzu.set(j7);
        return this;
    }

    public final zzfdb zzy(zzfdc zzfdcVar) {
        this.zzo.zza(zzfdcVar.zzp.zza);
        this.zza = zzfdcVar.zzd;
        this.zzb = zzfdcVar.zzf;
        this.zzv = zzfdcVar.zzv;
        this.zzc = zzfdcVar.zzg;
        this.zzd = zzfdcVar.zza;
        this.zzf = zzfdcVar.zzh;
        this.zzg = zzfdcVar.zzi;
        this.zzh = zzfdcVar.zzj;
        this.zzi = zzfdcVar.zzk;
        zzs(zzfdcVar.zzm);
        zzr(zzfdcVar.zzn);
        this.zzp = zzfdcVar.zzq;
        this.zzq = zzfdcVar.zzr;
        this.zzr = zzfdcVar.zzc;
        this.zzs = zzfdcVar.zzs;
        this.zzt = zzfdcVar.zzt;
        this.zzu.set(zzfdcVar.zzu.get());
        return this;
    }

    public final zzfdc zzz() {
        AbstractC3718s.m18084m(this.zzc, "ad unit must not be null");
        AbstractC3718s.m18084m(this.zzb, "ad size must not be null");
        AbstractC3718s.m18084m(this.zza, "ad request must not be null");
        return new zzfdc(this, null);
    }
}
