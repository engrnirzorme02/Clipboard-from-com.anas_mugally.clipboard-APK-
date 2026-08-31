package p142S2;

import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: S2.k */
/* JADX INFO: loaded from: classes.dex */
final class C1400k extends AbstractC1403n {
    C1400k(AbstractC3560h abstractC3560h) {
        super(abstractC3560h);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ InterfaceC3643m createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3594d
    protected final /* bridge */ /* synthetic */ void doExecute(C3553a.b bVar) {
        C1398i c1398i = (C1398i) bVar;
        ((C1410u) c1398i.getService()).m5999L0(new BinderC1399j(this), c1398i.m5985e());
    }
}
