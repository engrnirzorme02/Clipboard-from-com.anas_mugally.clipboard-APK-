package p328p6;

import android.os.Looper;
import java.util.List;
import p318o6.AbstractC6615I0;
import p360t6.InterfaceC7134r;

/* JADX INFO: renamed from: p6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6773a implements InterfaceC7134r {
    @Override // p360t6.InterfaceC7134r
    /* JADX INFO: renamed from: a */
    public String mo29606a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p360t6.InterfaceC7134r
    /* JADX INFO: renamed from: b */
    public AbstractC6615I0 mo29607b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C6777e(AbstractC6779g.m29616a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p360t6.InterfaceC7134r
    /* JADX INFO: renamed from: c */
    public int mo29608c() {
        return 1073741823;
    }
}
