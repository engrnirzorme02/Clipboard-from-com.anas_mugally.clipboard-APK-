package p318o6;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC6112h;
import p173W5.AbstractC1872b;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: o6.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6683p0 extends AbstractC6618K implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: c */
    public static final a f24987c = new a(null);

    /* JADX INFO: renamed from: o6.p0$a */
    public static final class a extends AbstractC1872b {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final AbstractC6683p0 m28276d(InterfaceC1879i.b bVar) {
            if (bVar instanceof AbstractC6683p0) {
                return (AbstractC6683p0) bVar;
            }
            return null;
        }

        private a() {
            super(AbstractC6618K.f24908b, new InterfaceC5367l() { // from class: o6.o0
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return AbstractC6683p0.a.m28276d((InterfaceC1879i.b) obj);
                }
            });
        }
    }
}
