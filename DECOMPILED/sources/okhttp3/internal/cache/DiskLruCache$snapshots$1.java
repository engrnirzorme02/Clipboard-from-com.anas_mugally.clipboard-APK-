package okhttp3.internal.cache;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p246f6.InterfaceC5442a;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    private final Iterator f25568a;

    /* JADX INFO: renamed from: b */
    private DiskLruCache.Snapshot f25569b;

    /* JADX INFO: renamed from: c */
    private DiskLruCache.Snapshot f25570c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ DiskLruCache f25571d;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        DiskLruCache.Snapshot snapshot = this.f25569b;
        this.f25570c = snapshot;
        this.f25569b = null;
        AbstractC6118n.m27184b(snapshot);
        return snapshot;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        DiskLruCache.Snapshot snapshotM28858r;
        if (this.f25569b != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.f25571d;
        synchronized (diskLruCache) {
            if (diskLruCache.m28822R0()) {
                return false;
            }
            while (this.f25568a.hasNext()) {
                DiskLruCache.Entry entry = (DiskLruCache.Entry) this.f25568a.next();
                if (entry != null && (snapshotM28858r = entry.m28858r()) != null) {
                    this.f25569b = snapshotM28858r;
                    return true;
                }
            }
            C1444v c1444v = C1444v.f4971a;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache.Snapshot snapshot = this.f25570c;
        if (snapshot == null) {
            throw new IllegalStateException("remove() before next()");
        }
        try {
            this.f25571d.m28828c1(snapshot.m28862n());
        } catch (IOException unused) {
        } finally {
            this.f25570c = null;
        }
    }
}
