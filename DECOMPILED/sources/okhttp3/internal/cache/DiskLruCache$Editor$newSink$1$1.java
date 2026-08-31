package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.C1444v;
import p238e6.InterfaceC5367l;

/* JADX INFO: loaded from: classes.dex */
final class DiskLruCache$Editor$newSink$1$1 extends AbstractC6119o implements InterfaceC5367l {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DiskLruCache f25546a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ DiskLruCache.Editor f25547b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.f25546a = diskLruCache;
        this.f25547b = editor;
    }

    /* JADX INFO: renamed from: a */
    public final void m28840a(IOException it) {
        AbstractC6118n.m27187e(it, "it");
        DiskLruCache diskLruCache = this.f25546a;
        DiskLruCache.Editor editor = this.f25547b;
        synchronized (diskLruCache) {
            editor.m28836c();
            C1444v c1444v = C1444v.f4971a;
        }
    }

    @Override // p238e6.InterfaceC5367l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m28840a((IOException) obj);
        return C1444v.f4971a;
    }
}
