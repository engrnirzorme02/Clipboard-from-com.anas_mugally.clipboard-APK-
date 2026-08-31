package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.cache.DiskLruCache;
import p072I6.AbstractC0659p;
import p220c6.AbstractC3026b;
import p246f6.InterfaceC5442a;

/* JADX INFO: loaded from: classes.dex */
public final class Cache$urls$1 implements Iterator<String>, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    private final Iterator f25049a;

    /* JADX INFO: renamed from: b */
    private String f25050b;

    /* JADX INFO: renamed from: c */
    private boolean f25051c;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f25050b;
        AbstractC6118n.m27184b(str);
        this.f25050b = null;
        this.f25051c = true;
        return str;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f25050b != null) {
            return true;
        }
        this.f25051c = false;
        while (this.f25049a.hasNext()) {
            try {
                Closeable closeable = (Closeable) this.f25049a.next();
                try {
                    continue;
                    this.f25050b = AbstractC0659p.m3132d(((DiskLruCache.Snapshot) closeable).m28861m(0)).mo3056n0();
                    AbstractC3026b.m14999a(closeable, null);
                    return true;
                } catch (Throwable th) {
                    try {
                        continue;
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3026b.m14999a(closeable, th);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f25051c) {
            throw new IllegalStateException("remove() before next()");
        }
        this.f25049a.remove();
    }
}
