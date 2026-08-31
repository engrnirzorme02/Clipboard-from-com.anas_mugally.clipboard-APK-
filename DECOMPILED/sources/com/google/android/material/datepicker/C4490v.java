package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import p104N.C0906c;
import p325p3.AbstractC6748i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.v */
/* JADX INFO: loaded from: classes2.dex */
class C4490v extends BaseAdapter {

    /* JADX INFO: renamed from: f */
    static final int f17001f = AbstractC4466C.m20223m().getMaximum(4);

    /* JADX INFO: renamed from: g */
    private static final int f17002g = (AbstractC4466C.m20223m().getMaximum(5) + AbstractC4466C.m20223m().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a */
    final C4489u f17003a;

    /* JADX INFO: renamed from: b */
    final InterfaceC4477i f17004b;

    /* JADX INFO: renamed from: c */
    private Collection f17005c;

    /* JADX INFO: renamed from: d */
    C4471c f17006d;

    /* JADX INFO: renamed from: e */
    final C4469a f17007e;

    C4490v(C4489u c4489u, InterfaceC4477i interfaceC4477i, C4469a c4469a, AbstractC4480l abstractC4480l) {
        this.f17003a = c4489u;
        this.f17004b = interfaceC4477i;
        this.f17007e = c4469a;
        this.f17005c = interfaceC4477i.mo20278I();
    }

    /* JADX INFO: renamed from: c */
    private String m20387c(Context context, long j7) {
        return AbstractC4478j.m20290e(context, j7, m20390l(j7), m20400k(j7), m20397g(j7));
    }

    /* JADX INFO: renamed from: f */
    private void m20388f(Context context) {
        if (this.f17006d == null) {
            this.f17006d = new C4471c(context);
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m20389j(long j7) {
        Iterator it = this.f17004b.mo20278I().iterator();
        while (it.hasNext()) {
            if (AbstractC4466C.m20211a(j7) == AbstractC4466C.m20211a(((Long) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private boolean m20390l(long j7) {
        return AbstractC4466C.m20221k().getTimeInMillis() == j7;
    }

    /* JADX INFO: renamed from: o */
    private void m20391o(TextView textView, long j7, int i7) {
        C4470b c4470b;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(m20387c(textView.getContext(), j7));
        if (this.f17007e.m20245g().mo20258D(j7)) {
            textView.setEnabled(true);
            boolean zM20389j = m20389j(j7);
            textView.setSelected(zM20389j);
            if (zM20389j) {
                c4470b = this.f17006d.f16868b;
            } else {
                c4470b = m20390l(j7) ? this.f17006d.f16869c : this.f17006d.f16867a;
            }
        } else {
            textView.setEnabled(false);
            c4470b = this.f17006d.f16873g;
        }
        c4470b.m20262d(textView);
    }

    /* JADX INFO: renamed from: p */
    private void m20392p(MaterialCalendarGridView materialCalendarGridView, long j7) {
        if (C4489u.m20375h(j7).equals(this.f17003a)) {
            int iM20384t = this.f17003a.m20384t(j7);
            m20391o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m20393a(iM20384t) - materialCalendarGridView.getFirstVisiblePosition()), j7, iM20384t);
        }
    }

    /* JADX INFO: renamed from: a */
    int m20393a(int i7) {
        return m20394b() + (i7 - 1);
    }

    /* JADX INFO: renamed from: b */
    int m20394b() {
        return this.f17003a.m20382n(this.f17007e.m20247i());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i7) {
        if (i7 < m20394b() || i7 > m20401m()) {
            return null;
        }
        return Long.valueOf(this.f17003a.m20383o(m20402n(i7)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i7, View view, ViewGroup viewGroup) {
        int i8;
        m20388f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC6748i.f26472u, viewGroup, false);
        }
        int iM20394b = i7 - m20394b();
        if (iM20394b >= 0) {
            C4489u c4489u = this.f17003a;
            if (iM20394b >= c4489u.f16998e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i8 = -1;
            } else {
                i8 = iM20394b + 1;
                textView.setTag(c4489u);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i8)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i8 = -1;
        }
        Long item = getItem(i7);
        if (item == null) {
            return textView;
        }
        m20391o(textView, item.longValue(), i8);
        return textView;
    }

    /* JADX INFO: renamed from: g */
    boolean m20397g(long j7) {
        Iterator it = this.f17004b.mo20282k().iterator();
        while (it.hasNext()) {
            Object obj = ((C0906c) it.next()).f3547b;
            if (obj != null && ((Long) obj).longValue() == j7) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f17002g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7 / this.f17003a.f16997d;
    }

    /* JADX INFO: renamed from: h */
    boolean m20398h(int i7) {
        return i7 % this.f17003a.f16997d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    boolean m20399i(int i7) {
        return (i7 + 1) % this.f17003a.f16997d == 0;
    }

    /* JADX INFO: renamed from: k */
    boolean m20400k(long j7) {
        Iterator it = this.f17004b.mo20282k().iterator();
        while (it.hasNext()) {
            Object obj = ((C0906c) it.next()).f3546a;
            if (obj != null && ((Long) obj).longValue() == j7) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    int m20401m() {
        return (m20394b() + this.f17003a.f16998e) - 1;
    }

    /* JADX INFO: renamed from: n */
    int m20402n(int i7) {
        return (i7 - m20394b()) + 1;
    }

    /* JADX INFO: renamed from: q */
    public void m20403q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f17005c.iterator();
        while (it.hasNext()) {
            m20392p(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        InterfaceC4477i interfaceC4477i = this.f17004b;
        if (interfaceC4477i != null) {
            Iterator it2 = interfaceC4477i.mo20278I().iterator();
            while (it2.hasNext()) {
                m20392p(materialCalendarGridView, ((Long) it2.next()).longValue());
            }
            this.f17005c = this.f17004b.mo20278I();
        }
    }

    /* JADX INFO: renamed from: r */
    boolean m20404r(int i7) {
        return i7 >= m20394b() && i7 <= m20401m();
    }
}
