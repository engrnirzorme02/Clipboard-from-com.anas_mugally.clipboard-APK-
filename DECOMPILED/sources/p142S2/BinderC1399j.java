package p142S2;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: renamed from: S2.j */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1399j extends AbstractBinderC1394e {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1400k f4907a;

    BinderC1399j(C1400k c1400k) {
        Objects.requireNonNull(c1400k);
        this.f4907a = c1400k;
    }

    @Override // p142S2.AbstractBinderC1394e, p142S2.InterfaceC1409t
    /* JADX INFO: renamed from: W */
    public final void mo5979W(Status status) {
        this.f4907a.setResult(status);
    }
}
