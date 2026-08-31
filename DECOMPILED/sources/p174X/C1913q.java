package p174X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p220c6.AbstractC3026b;

/* JADX INFO: renamed from: X.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1913q extends C1910n implements InterfaceC1896P {

    /* JADX INFO: renamed from: X.q$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6312a;

        /* JADX INFO: renamed from: b */
        Object f6313b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6314c;

        /* JADX INFO: renamed from: e */
        int f6316e;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6314c = obj;
            this.f6316e |= Integer.MIN_VALUE;
            return C1913q.this.mo7832a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1913q(File file, InterfaceC1885E serializer) {
        super(file, serializer);
        AbstractC6118n.m27187e(file, "file");
        AbstractC6118n.m27187e(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p174X.InterfaceC1896P
    /* JADX INFO: renamed from: a */
    public Object mo7832a(Object obj, InterfaceC1875e interfaceC1875e) throws IOException {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f6316e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f6316e = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj2 = aVar.f6314c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f6316e;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj2);
            m7914f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(m7915g());
            try {
                InterfaceC1885E interfaceC1885EM7916h = m7916h();
                C1894N c1894n = new C1894N(fileOutputStream2);
                aVar.f6312a = fileOutputStream2;
                aVar.f6313b = fileOutputStream2;
                aVar.f6316e = 1;
                if (interfaceC1885EM7916h.writeTo(obj, c1894n, aVar) == objE) {
                    return objE;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f6313b;
            closeable = (Closeable) aVar.f6312a;
            try {
                AbstractC1437o.m6082b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC3026b.m14999a(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        C1444v c1444v = C1444v.f4971a;
        AbstractC3026b.m14999a(closeable, null);
        return C1444v.f4971a;
    }
}
