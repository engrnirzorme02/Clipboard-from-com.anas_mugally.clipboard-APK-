package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p192Z3.InterfaceC2144v;

/* JADX INFO: renamed from: com.google.firebase.auth.n0 */
/* JADX INFO: loaded from: classes.dex */
final class C4869n0 implements InterfaceC2144v {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ AbstractC4880u f18543a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ FirebaseAuth f18544b;

    C4869n0(FirebaseAuth firebaseAuth, AbstractC4880u abstractC4880u) {
        this.f18543a = abstractC4880u;
        Objects.requireNonNull(firebaseAuth);
        this.f18544b = firebaseAuth;
    }

    @Override // p192Z3.InterfaceC2144v
    public final void zza() {
        if (this.f18544b.f18444f == null || !this.f18544b.f18444f.mo8711b0().equalsIgnoreCase(this.f18543a.mo8711b0())) {
            return;
        }
        this.f18544b.m21987F();
    }

    @Override // p192Z3.InterfaceC2143u
    public final void zza(Status status) {
        if (status.m17744U() == 17011 || status.m17744U() == 17021 || status.m17744U() == 17005) {
            this.f18544b.m21995k();
        }
    }
}
