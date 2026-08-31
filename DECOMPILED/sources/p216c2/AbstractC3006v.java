package p216c2;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p282k2.InterfaceC5995d;

/* JADX INFO: renamed from: c2.v */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3006v implements Closeable {

    /* JADX INFO: renamed from: c2.v$a */
    interface a {
        /* JADX INFO: renamed from: a */
        AbstractC3006v mo14937a();

        /* JADX INFO: renamed from: b */
        a mo14938b(Context context);
    }

    AbstractC3006v() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo14941d().close();
    }

    /* JADX INFO: renamed from: d */
    abstract InterfaceC5995d mo14941d();

    /* JADX INFO: renamed from: m */
    abstract C3005u mo14942m();
}
