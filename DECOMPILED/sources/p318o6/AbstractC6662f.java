package p318o6;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;

/* JADX INFO: renamed from: o6.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6662f {

    /* JADX INFO: renamed from: o6.f$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f24951a;

        /* JADX INFO: renamed from: b */
        int f24952b;

        /* JADX INFO: renamed from: c */
        int f24953c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f24954d;

        /* JADX INFO: renamed from: e */
        int f24955e;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f24954d = obj;
            this.f24955e |= Integer.MIN_VALUE;
            return AbstractC6662f.m28178c(null, this);
        }
    }

    /* JADX INFO: renamed from: o6.f$b */
    static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f24956a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f24957b;

        /* JADX INFO: renamed from: c */
        int f24958c;

        b(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f24957b = obj;
            this.f24958c |= Integer.MIN_VALUE;
            return AbstractC6662f.m28177b(null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m28176a(InterfaceC6639V[] interfaceC6639VArr, InterfaceC1875e interfaceC1875e) {
        return interfaceC6639VArr.length == 0 ? AbstractC1638q.m6765j() : new C6660e(interfaceC6639VArr).m28168c(interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m28177b(Collection collection, InterfaceC1875e interfaceC1875e) {
        b bVar;
        Iterator it;
        if (interfaceC1875e instanceof b) {
            bVar = (b) interfaceC1875e;
            int i7 = bVar.f24958c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f24958c = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC1875e);
            }
        } else {
            bVar = new b(interfaceC1875e);
        }
        Object obj = bVar.f24957b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = bVar.f24958c;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            it = collection.iterator();
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) bVar.f24956a;
            AbstractC1437o.m6082b(obj);
        }
        while (it.hasNext()) {
            InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) it.next();
            bVar.f24956a = it;
            bVar.f24958c = 1;
            if (interfaceC6701y0.join(bVar) == objE) {
                return objE;
            }
        }
        return C1444v.f4971a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m28178c(p318o6.InterfaceC6701y0[] r6, p173W5.InterfaceC1875e r7) {
        /*
            boolean r0 = r7 instanceof p318o6.AbstractC6662f.a
            if (r0 == 0) goto L13
            r0 = r7
            o6.f$a r0 = (p318o6.AbstractC6662f.a) r0
            int r1 = r0.f24955e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24955e = r1
            goto L18
        L13:
            o6.f$a r0 = new o6.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24954d
            java.lang.Object r1 = p180X5.AbstractC2005b.m8369e()
            int r2 = r0.f24955e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f24953c
            int r2 = r0.f24952b
            java.lang.Object r4 = r0.f24951a
            o6.y0[] r4 = (p318o6.InterfaceC6701y0[]) r4
            p145S5.AbstractC1437o.m6082b(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            p145S5.AbstractC1437o.m6082b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f24951a = r7
            r0.f24952b = r2
            r0.f24953c = r6
            r0.f24955e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            S5.v r6 = p145S5.C1444v.f4971a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p318o6.AbstractC6662f.m28178c(o6.y0[], W5.e):java.lang.Object");
    }
}
