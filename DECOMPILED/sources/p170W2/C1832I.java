package p170W2;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: W2.I */
/* JADX INFO: loaded from: classes.dex */
final class C1832I extends C1834K {

    /* JADX INFO: renamed from: f */
    private final Callable f5964f;

    /* synthetic */ C1832I(Callable callable, AbstractC1833J abstractC1833J) {
        super();
        this.f5964f = callable;
    }

    @Override // p170W2.C1834K
    /* JADX INFO: renamed from: a */
    final String mo7586a() {
        try {
            return (String) this.f5964f.call();
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
