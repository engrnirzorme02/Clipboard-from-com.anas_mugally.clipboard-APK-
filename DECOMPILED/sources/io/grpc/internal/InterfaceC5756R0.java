package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.grpc.internal.R0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5756R0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5756R0 f22224a = new a();

    /* JADX INFO: renamed from: io.grpc.internal.R0$a */
    class a implements InterfaceC5756R0 {
        a() {
        }

        @Override // io.grpc.internal.InterfaceC5756R0
        /* JADX INFO: renamed from: a */
        public long mo25662a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: a */
    long mo25662a();
}
