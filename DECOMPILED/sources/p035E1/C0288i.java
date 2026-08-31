package p035E1;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC3220e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p104N.InterfaceC0907d;
import p127Q1.InterfaceC1251e;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: E1.i */
/* JADX INFO: loaded from: classes.dex */
public class C0288i {

    /* JADX INFO: renamed from: a */
    private final Class f1150a;

    /* JADX INFO: renamed from: b */
    private final List f1151b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1251e f1152c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0907d f1153d;

    /* JADX INFO: renamed from: e */
    private final String f1154e;

    /* JADX INFO: renamed from: E1.i$a */
    interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC0301v mo1375a(InterfaceC0301v interfaceC0301v);
    }

    public C0288i(Class cls, Class cls2, Class cls3, List list, InterfaceC1251e interfaceC1251e, InterfaceC0907d interfaceC0907d) {
        this.f1150a = cls;
        this.f1151b = list;
        this.f1152c = interfaceC1251e;
        this.f1153d = interfaceC0907d;
        this.f1154e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC0301v m1388b(InterfaceC3220e interfaceC3220e, int i7, int i8, C0132h c0132h) {
        List list = (List) AbstractC2022k.m8408e((List) this.f1153d.mo4131b());
        try {
            return m1389c(interfaceC3220e, i7, i8, c0132h, list);
        } finally {
            this.f1153d.mo4130a(list);
        }
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC0301v m1389c(InterfaceC3220e interfaceC3220e, int i7, int i8, C0132h c0132h, List list) throws C0296q {
        int size = this.f1151b.size();
        InterfaceC0301v interfaceC0301vMo605a = null;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC0134j interfaceC0134j = (InterfaceC0134j) this.f1151b.get(i9);
            try {
                if (interfaceC0134j.mo606b(interfaceC3220e.mo4040a(), c0132h)) {
                    interfaceC0301vMo605a = interfaceC0134j.mo605a(interfaceC3220e.mo4040a(), i7, i8, c0132h);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e7) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC0134j, e7);
                }
                list.add(e7);
            }
            if (interfaceC0301vMo605a != null) {
                break;
            }
        }
        if (interfaceC0301vMo605a != null) {
            return interfaceC0301vMo605a;
        }
        throw new C0296q(this.f1154e, new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0301v m1390a(InterfaceC3220e interfaceC3220e, int i7, int i8, C0132h c0132h, a aVar) {
        return this.f1152c.mo5496a(aVar.mo1375a(m1388b(interfaceC3220e, i7, i8, c0132h)), c0132h);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f1150a + ", decoders=" + this.f1151b + ", transcoder=" + this.f1152c + '}';
    }
}
