package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.measurement.internal.C4164X2;
import com.google.android.gms.measurement.internal.C4371x4;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.a */
/* JADX INFO: loaded from: classes2.dex */
final class C3988a extends AbstractC3990c {

    /* JADX INFO: renamed from: a */
    private final C4164X2 f15055a;

    /* JADX INFO: renamed from: b */
    private final C4371x4 f15056b;

    public C3988a(C4164X2 c4164x2) {
        super(null);
        AbstractC3718s.m18083l(c4164x2);
        this.f15055a = c4164x2;
        this.f15056b = c4164x2.m18660B();
    }

    @Override // p283k3.InterfaceC6022E
    /* JADX INFO: renamed from: a */
    public final void mo18412a(String str, String str2, Bundle bundle) {
        this.f15056b.m19295p(str, str2, bundle);
    }

    @Override // p283k3.InterfaceC6022E
    /* JADX INFO: renamed from: b */
    public final void mo18413b(String str, String str2, Bundle bundle) {
        this.f15055a.m18660B().m19270O(str, str2, bundle);
    }

    @Override // p283k3.InterfaceC6022E
    /* JADX INFO: renamed from: c */
    public final List mo18414c(String str, String str2) {
        return this.f15056b.m19271P(str, str2);
    }

    @Override // p283k3.InterfaceC6022E
    /* JADX INFO: renamed from: d */
    public final Map mo18415d(String str, String str2, boolean z7) {
        return this.f15056b.m19258C(str, str2, z7);
    }

    @Override // p283k3.InterfaceC6022E
    public final String zzh() {
        return this.f15056b.m19272Q();
    }

    @Override // p283k3.InterfaceC6022E
    public final String zzi() {
        return this.f15056b.m19273R();
    }

    @Override // p283k3.InterfaceC6022E
    public final String zzj() {
        return this.f15056b.m19259D();
    }

    @Override // p283k3.InterfaceC6022E
    public final String zzk() {
        return this.f15056b.m19274S();
    }

    @Override // p283k3.InterfaceC6022E
    public final long zzl() {
        return this.f15055a.m18661C().m19401p0();
    }

    @Override // p283k3.InterfaceC6022E
    public final void zzm(String str) {
        C4164X2 c4164x2 = this.f15055a;
        c4164x2.m18671M().m18446i(str, c4164x2.mo18425f().mo18161c());
    }

    @Override // p283k3.InterfaceC6022E
    public final void zzn(String str) {
        C4164X2 c4164x2 = this.f15055a;
        c4164x2.m18671M().m18447j(str, c4164x2.mo18425f().mo18161c());
    }

    @Override // p283k3.InterfaceC6022E
    public final void zzo(Bundle bundle) {
        this.f15056b.m19268M(bundle);
    }

    @Override // p283k3.InterfaceC6022E
    public final int zzr(String str) {
        this.f15056b.m19267L(str);
        return 25;
    }
}
