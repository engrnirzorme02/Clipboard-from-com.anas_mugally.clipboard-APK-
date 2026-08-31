package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.grpc.internal.h */
/* JADX INFO: loaded from: classes.dex */
final class C5784h implements InterfaceC5781f0 {

    /* JADX INFO: renamed from: a */
    private final AtomicLong f22487a = new AtomicLong();

    C5784h() {
    }

    @Override // io.grpc.internal.InterfaceC5781f0
    /* JADX INFO: renamed from: a */
    public void mo25421a(long j7) {
        this.f22487a.getAndAdd(j7);
    }
}
