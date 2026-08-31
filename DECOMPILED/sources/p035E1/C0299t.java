package p035E1;

import com.bumptech.glide.load.data.InterfaceC3220e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p019C1.C0132h;
import p104N.InterfaceC0907d;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: E1.t */
/* JADX INFO: loaded from: classes.dex */
public class C0299t {

    /* JADX INFO: renamed from: a */
    private final Class f1246a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0907d f1247b;

    /* JADX INFO: renamed from: c */
    private final List f1248c;

    /* JADX INFO: renamed from: d */
    private final String f1249d;

    public C0299t(Class cls, Class cls2, Class cls3, List list, InterfaceC0907d interfaceC0907d) {
        this.f1246a = cls;
        this.f1247b = interfaceC0907d;
        this.f1248c = (List) AbstractC2022k.m8407d(list);
        this.f1249d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC0301v m1459b(InterfaceC3220e interfaceC3220e, C0132h c0132h, int i7, int i8, C0288i.a aVar, List list) throws C0296q {
        int size = this.f1248c.size();
        InterfaceC0301v interfaceC0301vM1390a = null;
        for (int i9 = 0; i9 < size; i9++) {
            try {
                interfaceC0301vM1390a = ((C0288i) this.f1248c.get(i9)).m1390a(interfaceC3220e, i7, i8, c0132h, aVar);
            } catch (C0296q e7) {
                list.add(e7);
            }
            if (interfaceC0301vM1390a != null) {
                break;
            }
        }
        if (interfaceC0301vM1390a != null) {
            return interfaceC0301vM1390a;
        }
        throw new C0296q(this.f1249d, new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0301v m1460a(InterfaceC3220e interfaceC3220e, C0132h c0132h, int i7, int i8, C0288i.a aVar) {
        List list = (List) AbstractC2022k.m8408e((List) this.f1247b.mo4131b());
        try {
            return m1459b(interfaceC3220e, c0132h, i7, i8, aVar, list);
        } finally {
            this.f1247b.mo4130a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f1248c.toArray()) + '}';
    }
}
