package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzfb;
import java.util.List;
import java.util.Map;
import p283k3.InterfaceC6022E;

/* JADX INFO: renamed from: com.google.firebase.analytics.a */
/* JADX INFO: loaded from: classes.dex */
final class C4808a implements InterfaceC6022E {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzfb f18419a;

    C4808a(zzfb zzfbVar) {
        this.f18419a = zzfbVar;
    }

    @Override // p283k3.InterfaceC6022E
    /* JADX INFO: renamed from: a */
    public final void mo18412a(String str, String str2, Bundle bundle) {
        this.f18419a.zzi(str, str2, bundle);
    }

    @Override // p283k3.InterfaceC6022E
    /* JADX INFO: renamed from: b */
    public final void mo18413b(String str, String str2, Bundle bundle) {
        this.f18419a.zzm(str, str2, bundle);
    }

    @Override // p283k3.InterfaceC6022E
    /* JADX INFO: renamed from: c */
    public final List mo18414c(String str, String str2) {
        return this.f18419a.zzn(str, str2);
    }

    @Override // p283k3.InterfaceC6022E
    /* JADX INFO: renamed from: d */
    public final Map mo18415d(String str, String str2, boolean z7) {
        return this.f18419a.zzC(str, str2, z7);
    }

    @Override // p283k3.InterfaceC6022E
    public final String zzh() {
        return this.f18419a.zzA();
    }

    @Override // p283k3.InterfaceC6022E
    public final String zzi() {
        return this.f18419a.zzB();
    }

    @Override // p283k3.InterfaceC6022E
    public final String zzj() {
        return this.f18419a.zzy();
    }

    @Override // p283k3.InterfaceC6022E
    public final String zzk() {
        return this.f18419a.zzx();
    }

    @Override // p283k3.InterfaceC6022E
    public final long zzl() {
        return this.f18419a.zzz();
    }

    @Override // p283k3.InterfaceC6022E
    public final void zzm(String str) {
        this.f18419a.zzu(str);
    }

    @Override // p283k3.InterfaceC6022E
    public final void zzn(String str) {
        this.f18419a.zzv(str);
    }

    @Override // p283k3.InterfaceC6022E
    public final void zzo(Bundle bundle) {
        this.f18419a.zzl(bundle);
    }

    @Override // p283k3.InterfaceC6022E
    public final int zzr(String str) {
        return this.f18419a.zzF(str);
    }
}
