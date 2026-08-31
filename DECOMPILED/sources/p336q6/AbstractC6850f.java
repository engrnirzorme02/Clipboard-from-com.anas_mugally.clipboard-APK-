package p336q6;

import kotlin.jvm.internal.AbstractC6116l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p286k6.InterfaceC6079e;
import p318o6.InterfaceC6678n;
import p360t6.AbstractC7107G;
import p360t6.C7104D;

/* JADX INFO: renamed from: q6.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6850f {

    /* JADX INFO: renamed from: a */
    private static final C6857m f27456a = new C6857m(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    public static final int f27457b = AbstractC7107G.m31400e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    private static final int f27458c = AbstractC7107G.m31400e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d */
    public static final C7104D f27459d = new C7104D("BUFFERED");

    /* JADX INFO: renamed from: e */
    private static final C7104D f27460e = new C7104D("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f */
    private static final C7104D f27461f = new C7104D("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g */
    private static final C7104D f27462g = new C7104D("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h */
    private static final C7104D f27463h = new C7104D("POISONED");

    /* JADX INFO: renamed from: i */
    private static final C7104D f27464i = new C7104D("DONE_RCV");

    /* JADX INFO: renamed from: j */
    private static final C7104D f27465j = new C7104D("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k */
    private static final C7104D f27466k = new C7104D("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l */
    private static final C7104D f27467l = new C7104D("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m */
    private static final C7104D f27468m = new C7104D("SUSPEND");

    /* JADX INFO: renamed from: n */
    private static final C7104D f27469n = new C7104D("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o */
    private static final C7104D f27470o = new C7104D("FAILED");

    /* JADX INFO: renamed from: p */
    private static final C7104D f27471p = new C7104D("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q */
    private static final C7104D f27472q = new C7104D("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r */
    private static final C7104D f27473r = new C7104D("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s */
    private static final C7104D f27474s = new C7104D("NO_CLOSE_CAUSE");

    /* JADX INFO: renamed from: q6.f$a */
    /* synthetic */ class a extends AbstractC6116l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        public static final a f27475a = new a();

        a() {
            super(2, AbstractC6850f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        /* JADX INFO: renamed from: d */
        public final C6857m m30026d(long j7, C6857m c6857m) {
            return AbstractC6850f.m30023x(j7, c6857m);
        }

        @Override // p238e6.InterfaceC5371p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m30026d(((Number) obj).longValue(), (C6857m) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final long m29997A(int i7) {
        if (i7 == 0) {
            return 0L;
        }
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final boolean m29998B(InterfaceC6678n interfaceC6678n, Object obj, InterfaceC5372q interfaceC5372q) {
        Object objMo28238h = interfaceC6678n.mo28238h(obj, null, interfaceC5372q);
        if (objMo28238h == null) {
            return false;
        }
        interfaceC6678n.mo28239l(objMo28238h);
        return true;
    }

    /* JADX INFO: renamed from: C */
    static /* synthetic */ boolean m29999C(InterfaceC6678n interfaceC6678n, Object obj, InterfaceC5372q interfaceC5372q, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            interfaceC5372q = null;
        }
        return m29998B(interfaceC6678n, obj, interfaceC5372q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final long m30021v(long j7, boolean z7) {
        return (z7 ? 4611686018427387904L : 0L) + j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final long m30022w(long j7, int i7) {
        return (((long) i7) << 60) + j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C6857m m30023x(long j7, C6857m c6857m) {
        return new C6857m(j7, c6857m, c6857m.m30059y(), 0);
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC6079e m30024y() {
        return a.f27475a;
    }

    /* JADX INFO: renamed from: z */
    public static final C7104D m30025z() {
        return f27467l;
    }
}
