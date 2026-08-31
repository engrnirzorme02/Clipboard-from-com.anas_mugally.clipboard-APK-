package p174X;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6698x;

/* JADX INFO: renamed from: X.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1919w {

    /* JADX INFO: renamed from: X.w$a */
    public static final class a extends AbstractC1919w {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5371p f6318a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC6698x f6319b;

        /* JADX INFO: renamed from: c */
        private final AbstractC1889I f6320c;

        /* JADX INFO: renamed from: d */
        private final InterfaceC1879i f6321d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5371p transform, InterfaceC6698x ack, AbstractC1889I abstractC1889I, InterfaceC1879i callerContext) {
            super(null);
            AbstractC6118n.m27187e(transform, "transform");
            AbstractC6118n.m27187e(ack, "ack");
            AbstractC6118n.m27187e(callerContext, "callerContext");
            this.f6318a = transform;
            this.f6319b = ack;
            this.f6320c = abstractC1889I;
            this.f6321d = callerContext;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC6698x m7928a() {
            return this.f6319b;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC1879i m7929b() {
            return this.f6321d;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC1889I m7930c() {
            return this.f6320c;
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC5371p m7931d() {
            return this.f6318a;
        }
    }

    public /* synthetic */ AbstractC1919w(AbstractC6112h abstractC6112h) {
        this();
    }

    private AbstractC1919w() {
    }
}
