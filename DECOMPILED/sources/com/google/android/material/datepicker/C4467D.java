package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p325p3.AbstractC6748i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.D */
/* JADX INFO: loaded from: classes2.dex */
class C4467D extends RecyclerView.AbstractC2757h {

    /* JADX INFO: renamed from: d */
    private final C4482n f16840d;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.D$a */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f16841a;

        a(int i7) {
            this.f16841a = i7;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4467D.this.f16840d.m20332n2(C4467D.this.f16840d.m20326d2().m20244f(C4489u.m20374d(this.f16841a, C4467D.this.f16840d.m20328f2().f16995b)));
            C4467D.this.f16840d.m20333o2(C4482n.l.DAY);
            C4467D.this.f16840d.m20331m2();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.D$b */
    public static class b extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: u */
        final TextView f16843u;

        b(TextView textView) {
            super(textView);
            this.f16843u = textView;
        }
    }

    C4467D(C4482n c4482n) {
        this.f16840d = c4482n;
    }

    /* JADX INFO: renamed from: C */
    private View.OnClickListener m20229C(int i7) {
        return new a(i7);
    }

    /* JADX INFO: renamed from: D */
    int m20230D(int i7) {
        return i7 - this.f16840d.m20326d2().m20250n().f16996c;
    }

    /* JADX INFO: renamed from: E */
    int m20231E(int i7) {
        return this.f16840d.m20326d2().m20250n().f16996c + i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo3682q(b bVar, int i7) {
        int iM20231E = m20231E(i7);
        bVar.f16843u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iM20231E)));
        TextView textView = bVar.f16843u;
        textView.setContentDescription(AbstractC4478j.m20296k(textView.getContext(), iM20231E));
        C4471c c4471cM20327e2 = this.f16840d.m20327e2();
        Calendar calendarM20221k = AbstractC4466C.m20221k();
        C4470b c4470b = calendarM20221k.get(1) == iM20231E ? c4471cM20327e2.f16872f : c4471cM20327e2.f16870d;
        Iterator it = this.f16840d.m20329g2().mo20278I().iterator();
        while (it.hasNext()) {
            calendarM20221k.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarM20221k.get(1) == iM20231E) {
                c4470b = c4471cM20327e2.f16871e;
            }
        }
        c4470b.m20262d(bVar.f16843u);
        bVar.f16843u.setSelected(c4470b == c4471cM20327e2.f16871e);
        bVar.f16843u.setOnClickListener(m20229C(iM20231E));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b mo3683s(ViewGroup viewGroup, int i7) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC6748i.f26477z, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: g */
    public int mo8548g() {
        return this.f16840d.m20326d2().m20251o();
    }
}
