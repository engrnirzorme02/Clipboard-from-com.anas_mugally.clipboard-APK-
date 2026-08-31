package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import okhttp3.internal.Util;
import p145S5.C1444v;
import p238e6.InterfaceC5367l;

/* JADX INFO: loaded from: classes.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends AbstractC6119o implements InterfaceC5367l {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DiskLruCache f25567a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f25567a = diskLruCache;
    }

    /* JADX INFO: renamed from: a */
    public final void m28864a(IOException it) {
        AbstractC6118n.m27187e(it, "it");
        DiskLruCache diskLruCache = this.f25567a;
        if (!Util.f25484h || Thread.holdsLock(diskLruCache)) {
            this.f25567a.f25539x = true;
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
    }

    @Override // p238e6.InterfaceC5367l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m28864a((IOException) obj);
        return C1444v.f4971a;
    }
}
