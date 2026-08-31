package okhttp3.internal.cache;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import p072I6.AbstractC0659p;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$cleanupTask$1 extends Task {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ DiskLruCache f25566e;

    @Override // okhttp3.internal.concurrent.Task
    /* JADX INFO: renamed from: f */
    public long mo28863f() {
        DiskLruCache diskLruCache = this.f25566e;
        synchronized (diskLruCache) {
            if (!diskLruCache.f25541z || diskLruCache.m28822R0()) {
                return -1L;
            }
            try {
                diskLruCache.m28830f1();
            } catch (IOException unused) {
                diskLruCache.f25522B = true;
            }
            try {
                if (diskLruCache.m28807W0()) {
                    diskLruCache.m28827b1();
                    diskLruCache.f25538w = 0;
                }
            } catch (IOException unused2) {
                diskLruCache.f25523C = true;
                diskLruCache.f25536u = AbstractC0659p.m3131c(AbstractC0659p.m3130b());
            }
            return -1L;
        }
    }
}
