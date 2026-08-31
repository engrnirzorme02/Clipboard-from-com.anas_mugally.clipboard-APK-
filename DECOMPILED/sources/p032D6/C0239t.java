package p032D6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0098f;
import p016B6.AbstractC0099g;
import p016B6.InterfaceC0096d;
import p145S5.AbstractC1430h;
import p145S5.EnumC1433k;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p278j6.AbstractC5905g;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.t */
/* JADX INFO: loaded from: classes.dex */
public class C0239t implements InterfaceC0096d, InterfaceC0222c {

    /* JADX INFO: renamed from: a */
    private final String f962a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0225f f963b;

    /* JADX INFO: renamed from: c */
    private final int f964c;

    /* JADX INFO: renamed from: d */
    private int f965d;

    /* JADX INFO: renamed from: e */
    private final String[] f966e;

    /* JADX INFO: renamed from: f */
    private final List[] f967f;

    /* JADX INFO: renamed from: g */
    private List f968g;

    /* JADX INFO: renamed from: h */
    private final boolean[] f969h;

    /* JADX INFO: renamed from: i */
    private Map f970i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1429g f971j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC1429g f972k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC1429g f973l;

    public C0239t(String serialName, InterfaceC0225f interfaceC0225f, int i7) {
        AbstractC6118n.m27187e(serialName, "serialName");
        this.f962a = serialName;
        this.f963b = interfaceC0225f;
        this.f964c = i7;
        this.f965d = -1;
        String[] strArr = new String[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            strArr[i8] = "[UNINITIALIZED]";
        }
        this.f966e = strArr;
        int i9 = this.f964c;
        this.f967f = new List[i9];
        this.f969h = new boolean[i9];
        this.f970i = AbstractC1610H.m6626h();
        EnumC1433k enumC1433k = EnumC1433k.PUBLICATION;
        this.f971j = AbstractC1430h.m6065a(enumC1433k, new InterfaceC5356a() { // from class: D6.q
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C0239t.m1159r(this.f959a);
            }
        });
        this.f972k = AbstractC1430h.m6065a(enumC1433k, new InterfaceC5356a() { // from class: D6.r
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C0239t.m1163w(this.f960a);
            }
        });
        this.f973l = AbstractC1430h.m6065a(enumC1433k, new InterfaceC5356a() { // from class: D6.s
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C0239t.m1157o(this.f961a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final int m1157o(C0239t c0239t) {
        return AbstractC0240u.m1166a(c0239t, c0239t.m1165t());
    }

    /* JADX INFO: renamed from: q */
    private final Map m1158q() {
        HashMap map = new HashMap();
        int length = this.f966e.length;
        for (int i7 = 0; i7 < length; i7++) {
            map.put(this.f966e[i7], Integer.valueOf(i7));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC7616b[] m1159r(C0239t c0239t) {
        InterfaceC7616b[] interfaceC7616bArrMo1133e;
        InterfaceC0225f interfaceC0225f = c0239t.f963b;
        return (interfaceC0225f == null || (interfaceC7616bArrMo1133e = interfaceC0225f.mo1133e()) == null) ? AbstractC0241v.f974a : interfaceC7616bArrMo1133e;
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC7616b[] m1160s() {
        return (InterfaceC7616b[]) this.f971j.getValue();
    }

    /* JADX INFO: renamed from: u */
    private final int m1161u() {
        return ((Number) this.f973l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final CharSequence m1162v(C0239t c0239t, int i7) {
        return c0239t.mo376g(i7) + ": " + c0239t.mo378i(i7).mo371a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC0096d[] m1163w(C0239t c0239t) {
        ArrayList arrayList;
        InterfaceC7616b[] interfaceC7616bArrMo1132c;
        InterfaceC0225f interfaceC0225f = c0239t.f963b;
        if (interfaceC0225f == null || (interfaceC7616bArrMo1132c = interfaceC0225f.mo1132c()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(interfaceC7616bArrMo1132c.length);
            for (InterfaceC7616b interfaceC7616b : interfaceC7616bArrMo1132c) {
                arrayList.add(interfaceC7616b.mo1120a());
            }
        }
        return AbstractC0233n.m1151b(arrayList);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: a */
    public String mo371a() {
        return this.f962a;
    }

    @Override // p032D6.InterfaceC0222c
    /* JADX INFO: renamed from: b */
    public Set mo1124b() {
        return this.f970i.keySet();
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: c */
    public boolean mo372c() {
        return InterfaceC0096d.a.m382c(this);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: d */
    public int mo373d(String name) {
        AbstractC6118n.m27187e(name, "name");
        Integer num = (Integer) this.f970i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: e */
    public AbstractC0098f mo374e() {
        return AbstractC0099g.a.f527a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0239t)) {
            return false;
        }
        InterfaceC0096d interfaceC0096d = (InterfaceC0096d) obj;
        if (!AbstractC6118n.m27183a(mo371a(), interfaceC0096d.mo371a()) || !Arrays.equals(m1165t(), ((C0239t) obj).m1165t()) || mo375f() != interfaceC0096d.mo375f()) {
            return false;
        }
        int iMo375f = mo375f();
        for (int i7 = 0; i7 < iMo375f; i7++) {
            if (!AbstractC6118n.m27183a(mo378i(i7).mo371a(), interfaceC0096d.mo378i(i7).mo371a()) || !AbstractC6118n.m27183a(mo378i(i7).mo374e(), interfaceC0096d.mo378i(i7).mo374e())) {
                return false;
            }
        }
        return true;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: f */
    public final int mo375f() {
        return this.f964c;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: g */
    public String mo376g(int i7) {
        return this.f966e[i7];
    }

    @Override // p016B6.InterfaceC0096d
    public List getAnnotations() {
        List list = this.f968g;
        return list == null ? AbstractC1638q.m6765j() : list;
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: h */
    public List mo377h(int i7) {
        List list = this.f967f[i7];
        return list == null ? AbstractC1638q.m6765j() : list;
    }

    public int hashCode() {
        return m1161u();
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: i */
    public InterfaceC0096d mo378i(int i7) {
        return m1160s()[i7].mo1120a();
    }

    @Override // p016B6.InterfaceC0096d
    public boolean isInline() {
        return InterfaceC0096d.a.m381b(this);
    }

    @Override // p016B6.InterfaceC0096d
    /* JADX INFO: renamed from: j */
    public boolean mo379j(int i7) {
        return this.f969h[i7];
    }

    /* JADX INFO: renamed from: p */
    public final void m1164p(String name, boolean z7) {
        AbstractC6118n.m27187e(name, "name");
        String[] strArr = this.f966e;
        int i7 = this.f965d + 1;
        this.f965d = i7;
        strArr[i7] = name;
        this.f969h[i7] = z7;
        this.f967f[i7] = null;
        if (i7 == this.f964c - 1) {
            this.f970i = m1158q();
        }
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC0096d[] m1165t() {
        return (InterfaceC0096d[]) this.f972k.getValue();
    }

    public String toString() {
        return AbstractC1638q.m6578R(AbstractC5905g.m26663k(0, this.f964c), ", ", mo371a() + '(', ")", 0, null, new InterfaceC5367l() { // from class: D6.p
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C0239t.m1162v(this.f958a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}
