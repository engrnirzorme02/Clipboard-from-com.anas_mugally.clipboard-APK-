package p142S2;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.internal.InterfaceC3624s;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p322p0.AbstractC6715a;

/* JADX INFO: renamed from: S2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1396g extends AbstractC6715a implements InterfaceC3624s {

    /* JADX INFO: renamed from: o */
    private final Semaphore f4904o;

    /* JADX INFO: renamed from: p */
    private final Set f4905p;

    public C1396g(Context context, Set set) {
        super(context);
        this.f4904o = new Semaphore(0);
        this.f4905p = set;
    }

    @Override // p322p0.AbstractC6715a
    /* JADX INFO: renamed from: C */
    public final /* bridge */ /* synthetic */ Object mo5983C() {
        Iterator it = this.f4905p.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (((AbstractC3560h) it.next()).m17776g(this)) {
                i7++;
            }
        }
        try {
            this.f4904o.tryAcquire(i7, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p322p0.AbstractC6716b
    /* JADX INFO: renamed from: p */
    protected final void mo5984p() {
        this.f4904o.drainPermits();
        m29515h();
    }
}
