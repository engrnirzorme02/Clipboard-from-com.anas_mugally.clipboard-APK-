package p192Z3;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C3592c;
import java.util.Objects;

/* JADX INFO: renamed from: Z3.U */
/* JADX INFO: loaded from: classes.dex */
final class C2106U implements ComponentCallbacks2C3592c.a {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ C2104S f6916a;

    C2106U(C2104S c2104s) {
        Objects.requireNonNull(c2104s);
        this.f6916a = c2104s;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3592c.a
    /* JADX INFO: renamed from: a */
    public final void mo7413a(boolean z7) {
        if (z7) {
            this.f6916a.f6911c = true;
            this.f6916a.m8655b();
        } else {
            this.f6916a.f6911c = false;
            if (this.f6916a.m8653f()) {
                this.f6916a.f6910b.m8746c();
            }
        }
    }
}
