package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.material.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public class C4525a {

    /* JADX INFO: renamed from: a */
    private final Map f17208a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Set f17209b = new HashSet();

    /* JADX INFO: renamed from: c */
    private b f17210c;

    /* JADX INFO: renamed from: d */
    private boolean f17211d;

    /* JADX INFO: renamed from: e */
    private boolean f17212e;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a */
    class a implements InterfaceC4533i.a {
        a() {
        }

        @Override // com.google.android.material.internal.InterfaceC4533i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo20620a(InterfaceC4533i interfaceC4533i, boolean z7) {
            if (!z7) {
                C4525a c4525a = C4525a.this;
                if (!c4525a.m20608r(interfaceC4533i, c4525a.f17212e)) {
                    return;
                }
            } else if (!C4525a.this.m20606g(interfaceC4533i)) {
                return;
            }
            C4525a.this.m20607m();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo20065a(Set set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m20606g(InterfaceC4533i interfaceC4533i) {
        int id = interfaceC4533i.getId();
        if (this.f17209b.contains(Integer.valueOf(id))) {
            return false;
        }
        InterfaceC4533i interfaceC4533i2 = (InterfaceC4533i) this.f17208a.get(Integer.valueOf(m20614k()));
        if (interfaceC4533i2 != null) {
            m20608r(interfaceC4533i2, false);
        }
        boolean zAdd = this.f17209b.add(Integer.valueOf(id));
        if (!interfaceC4533i.isChecked()) {
            interfaceC4533i.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m20607m() {
        b bVar = this.f17210c;
        if (bVar != null) {
            bVar.mo20065a(m20612i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public boolean m20608r(InterfaceC4533i interfaceC4533i, boolean z7) {
        int id = interfaceC4533i.getId();
        if (!this.f17209b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z7 && this.f17209b.size() == 1 && this.f17209b.contains(Integer.valueOf(id))) {
            interfaceC4533i.setChecked(true);
            return false;
        }
        boolean zRemove = this.f17209b.remove(Integer.valueOf(id));
        if (interfaceC4533i.isChecked()) {
            interfaceC4533i.setChecked(false);
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: e */
    public void m20609e(InterfaceC4533i interfaceC4533i) {
        this.f17208a.put(Integer.valueOf(interfaceC4533i.getId()), interfaceC4533i);
        if (interfaceC4533i.isChecked()) {
            m20606g(interfaceC4533i);
        }
        interfaceC4533i.setInternalOnCheckedChangeListener(new a());
    }

    /* JADX INFO: renamed from: f */
    public void m20610f(int i7) {
        InterfaceC4533i interfaceC4533i = (InterfaceC4533i) this.f17208a.get(Integer.valueOf(i7));
        if (interfaceC4533i != null && m20606g(interfaceC4533i)) {
            m20607m();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m20611h() {
        boolean zIsEmpty = this.f17209b.isEmpty();
        Iterator it = this.f17208a.values().iterator();
        while (it.hasNext()) {
            m20608r((InterfaceC4533i) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        m20607m();
    }

    /* JADX INFO: renamed from: i */
    public Set m20612i() {
        return new HashSet(this.f17209b);
    }

    /* JADX INFO: renamed from: j */
    public List m20613j(ViewGroup viewGroup) {
        Set setM20612i = m20612i();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof InterfaceC4533i) && setM20612i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public int m20614k() {
        if (!this.f17211d || this.f17209b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f17209b.iterator().next()).intValue();
    }

    /* JADX INFO: renamed from: l */
    public boolean m20615l() {
        return this.f17211d;
    }

    /* JADX INFO: renamed from: n */
    public void m20616n(InterfaceC4533i interfaceC4533i) {
        interfaceC4533i.setInternalOnCheckedChangeListener(null);
        this.f17208a.remove(Integer.valueOf(interfaceC4533i.getId()));
        this.f17209b.remove(Integer.valueOf(interfaceC4533i.getId()));
    }

    /* JADX INFO: renamed from: o */
    public void m20617o(b bVar) {
        this.f17210c = bVar;
    }

    /* JADX INFO: renamed from: p */
    public void m20618p(boolean z7) {
        this.f17212e = z7;
    }

    /* JADX INFO: renamed from: q */
    public void m20619q(boolean z7) {
        if (this.f17211d != z7) {
            this.f17211d = z7;
            m20611h();
        }
    }
}
