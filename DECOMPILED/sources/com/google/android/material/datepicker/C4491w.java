package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p111O.AbstractC1030Z;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.w */
/* JADX INFO: loaded from: classes2.dex */
class C4491w extends RecyclerView.AbstractC2757h {

    /* JADX INFO: renamed from: d */
    private final C4469a f17008d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC4477i f17009e;

    /* JADX INFO: renamed from: f */
    private final C4482n.m f17010f;

    /* JADX INFO: renamed from: g */
    private final int f17011g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.w$a */
    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaterialCalendarGridView f17012a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f17012a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            if (this.f17012a.getAdapter().m20404r(i7)) {
                C4491w.this.f17010f.mo20335a(this.f17012a.getAdapter().getItem(i7).longValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.w$b */
    public static class b extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: u */
        final TextView f17014u;

        /* JADX INFO: renamed from: v */
        final MaterialCalendarGridView f17015v;

        b(LinearLayout linearLayout, boolean z7) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(AbstractC6746g.f26440w);
            this.f17014u = textView;
            AbstractC1030Z.m4476k0(textView, true);
            this.f17015v = (MaterialCalendarGridView) linearLayout.findViewById(AbstractC6746g.f26436s);
            if (z7) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    C4491w(Context context, InterfaceC4477i interfaceC4477i, C4469a c4469a, AbstractC4480l abstractC4480l, C4482n.m mVar) {
        C4489u c4489uM20250n = c4469a.m20250n();
        C4489u c4489uM20246h = c4469a.m20246h();
        C4489u c4489uM20249m = c4469a.m20249m();
        if (c4489uM20250n.compareTo(c4489uM20249m) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c4489uM20249m.compareTo(c4489uM20246h) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f17011g = (C4490v.f17001f * C4482n.m20319h2(context)) + (C4486r.m20354v2(context) ? C4482n.m20319h2(context) : 0);
        this.f17008d = c4469a;
        this.f17009e = interfaceC4477i;
        this.f17010f = mVar;
        m13329z(true);
    }

    /* JADX INFO: renamed from: C */
    C4489u m20406C(int i7) {
        return this.f17008d.m20250n().m20379T(i7);
    }

    /* JADX INFO: renamed from: D */
    CharSequence m20407D(int i7) {
        return m20406C(i7).m20377J();
    }

    /* JADX INFO: renamed from: E */
    int m20408E(C4489u c4489u) {
        return this.f17008d.m20250n().m20380U(c4489u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo3682q(b bVar, int i7) {
        C4489u c4489uM20379T = this.f17008d.m20250n().m20379T(i7);
        bVar.f17014u.setText(c4489uM20379T.m20377J());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f17015v.findViewById(AbstractC6746g.f26436s);
        if (materialCalendarGridView.getAdapter() == null || !c4489uM20379T.equals(materialCalendarGridView.getAdapter().f17003a)) {
            C4490v c4490v = new C4490v(c4489uM20379T, this.f17009e, this.f17008d, null);
            materialCalendarGridView.setNumColumns(c4489uM20379T.f16997d);
            materialCalendarGridView.setAdapter((ListAdapter) c4490v);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m20403q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b mo3683s(ViewGroup viewGroup, int i7) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC6748i.f26475x, viewGroup, false);
        if (!C4486r.m20354v2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C2766q(-1, this.f17011g));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: g */
    public int mo8548g() {
        return this.f17008d.m20248l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: h */
    public long mo3680h(int i7) {
        return this.f17008d.m20250n().m20379T(i7).m20378M();
    }
}
