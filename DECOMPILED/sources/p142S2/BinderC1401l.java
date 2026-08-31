package p142S2;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: renamed from: S2.l */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1401l extends AbstractBinderC1394e {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1402m f4908a;

    BinderC1401l(C1402m c1402m) {
        Objects.requireNonNull(c1402m);
        this.f4908a = c1402m;
    }

    @Override // p142S2.AbstractBinderC1394e, p142S2.InterfaceC1409t
    /* JADX INFO: renamed from: i0 */
    public final void mo5980i0(Status status) {
        this.f4908a.setResult(status);
    }
}
