package p152T5;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.AbstractC6096k;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p238e6.InterfaceC5371p;
import p294l6.AbstractC6306g;
import p294l6.AbstractC6307h;

/* JADX INFO: renamed from: T5.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1621T {

    /* JADX INFO: renamed from: T5.T$a */
    static final class a extends AbstractC6096k implements InterfaceC5371p {

        /* JADX INFO: renamed from: b */
        Object f5376b;

        /* JADX INFO: renamed from: c */
        Object f5377c;

        /* JADX INFO: renamed from: d */
        int f5378d;

        /* JADX INFO: renamed from: e */
        int f5379e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f5380f;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ int f5381r;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ int f5382s;

        /* JADX INFO: renamed from: t */
        final /* synthetic */ Iterator f5383t;

        /* JADX INFO: renamed from: u */
        final /* synthetic */ boolean f5384u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ boolean f5385v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i7, int i8, Iterator it, boolean z7, boolean z8, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f5381r = i7;
            this.f5382s = i8;
            this.f5383t = it;
            this.f5384u = z7;
            this.f5385v = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(this.f5381r, this.f5382s, this.f5383t, this.f5384u, this.f5385v, interfaceC1875e);
            aVar.f5380f = obj;
            return aVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC6306g abstractC6306g, InterfaceC1875e interfaceC1875e) {
            return ((a) create(abstractC6306g, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:37:0x00be  */
        /* JADX WARN: Code duplicated, block: B:65:0x0130  */
        /* JADX WARN: Code duplicated, block: B:67:0x0134  */
        /* JADX WARN: Code duplicated, block: B:68:0x0136  */
        /* JADX WARN: Code duplicated, block: B:73:0x0150  */
        /* JADX WARN: Code duplicated, block: B:75:0x0156  */
        /* JADX WARN: Code duplicated, block: B:87:0x00b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x0089 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0086 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0094 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x007a A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0119 -> B:59:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0147 -> B:72:0x014a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0044
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p152T5.AbstractC1621T.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m6653a(int i7, int i8) {
        String str;
        if (i7 <= 0 || i8 <= 0) {
            if (i7 != i8) {
                str = "Both size " + i7 + " and step " + i8 + " must be greater than zero.";
            } else {
                str = "size " + i7 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Iterator m6654b(Iterator iterator, int i7, int i8, boolean z7, boolean z8) {
        AbstractC6118n.m27187e(iterator, "iterator");
        return !iterator.hasNext() ? C1604B.f5365a : AbstractC6307h.m27236a(new a(i7, i8, iterator, z8, z7, null));
    }
}
