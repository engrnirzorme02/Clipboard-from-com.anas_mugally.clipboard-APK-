package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC2639c0;
import androidx.lifecycle.InterfaceC2657s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p322p0.AbstractC6716b;

/* JADX INFO: renamed from: androidx.loader.app.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2665a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo12685a(AbstractC6716b abstractC6716b);

        /* JADX INFO: renamed from: b */
        AbstractC6716b mo12686b(int i7, Bundle bundle);

        /* JADX INFO: renamed from: c */
        void mo12687c(AbstractC6716b abstractC6716b, Object obj);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2665a m12681b(InterfaceC2657s interfaceC2657s) {
        return new C2666b(interfaceC2657s, ((InterfaceC2639c0) interfaceC2657s).mo11963v());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12682a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC6716b mo12683c(int i7, Bundle bundle, a aVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo12684d();
}
