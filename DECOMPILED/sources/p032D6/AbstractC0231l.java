package p032D6;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0095c;
import p016B6.InterfaceC0096d;
import p024C6.InterfaceC0154c;
import p024C6.InterfaceC0155d;
import p024C6.InterfaceC0157f;
import p152T5.AbstractC1610H;
import p278j6.AbstractC5905g;
import p278j6.C5902d;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231l extends AbstractC0220a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7616b f953a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7616b f954b;

    public /* synthetic */ AbstractC0231l(InterfaceC7616b interfaceC7616b, InterfaceC7616b interfaceC7616b2, AbstractC6112h abstractC6112h) {
        this(interfaceC7616b, interfaceC7616b2);
    }

    @Override // p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0096d mo1120a();

    @Override // p408z6.InterfaceC7619e
    /* JADX INFO: renamed from: d */
    public void mo1121d(InterfaceC0157f encoder, Object obj) {
        AbstractC6118n.m27187e(encoder, "encoder");
        int iMo1114j = mo1114j(obj);
        InterfaceC0096d interfaceC0096dMo1120a = mo1120a();
        InterfaceC0155d interfaceC0155dMo711m = encoder.mo711m(interfaceC0096dMo1120a, iMo1114j);
        Iterator itMo1113i = mo1113i(obj);
        int i7 = 0;
        while (itMo1113i.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo1113i.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i8 = i7 + 1;
            interfaceC0155dMo711m.mo705d(mo1120a(), i7, m1146r(), key);
            i7 += 2;
            interfaceC0155dMo711m.mo705d(mo1120a(), i8, m1147s(), value);
        }
        interfaceC0155dMo711m.mo723b(interfaceC0096dMo1120a);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC7616b m1146r() {
        return this.f953a;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC7616b m1147s() {
        return this.f954b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void mo1116l(InterfaceC0154c decoder, Map builder, int i7, int i8) {
        AbstractC6118n.m27187e(decoder, "decoder");
        AbstractC6118n.m27187e(builder, "builder");
        if (i8 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        C5902d c5902dJ = AbstractC5905g.m26662j(AbstractC5905g.m26663k(0, i8 * 2), 2);
        int iM26643a = c5902dJ.m26643a();
        int iM26644b = c5902dJ.m26644b();
        int iM26645e = c5902dJ.m26645e();
        if ((iM26645e <= 0 || iM26643a > iM26644b) && (iM26645e >= 0 || iM26644b > iM26643a)) {
            return;
        }
        while (true) {
            mo1117m(decoder, i7 + iM26643a, builder, false);
            if (iM26643a == iM26644b) {
                return;
            } else {
                iM26643a += iM26645e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void mo1117m(InterfaceC0154c decoder, int i7, Map builder, boolean z7) {
        int iMo719q;
        AbstractC6118n.m27187e(decoder, "decoder");
        AbstractC6118n.m27187e(builder, "builder");
        Object objM722c = InterfaceC0154c.a.m722c(decoder, mo1120a(), i7, this.f953a, null, 8, null);
        if (z7) {
            iMo719q = decoder.mo719q(mo1120a());
            if (iMo719q != i7 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i7 + ", returned index for value: " + iMo719q).toString());
            }
        } else {
            iMo719q = i7 + 1;
        }
        int i8 = iMo719q;
        builder.put(objM722c, (!builder.containsKey(objM722c) || (this.f954b.mo1120a().mo374e() instanceof AbstractC0095c)) ? InterfaceC0154c.a.m722c(decoder, mo1120a(), i8, this.f954b, null, 8, null) : decoder.mo697h(mo1120a(), i8, this.f954b, AbstractC1610H.m6627i(builder, objM722c)));
    }

    private AbstractC0231l(InterfaceC7616b interfaceC7616b, InterfaceC7616b interfaceC7616b2) {
        super(null);
        this.f953a = interfaceC7616b;
        this.f954b = interfaceC7616b2;
    }
}
