package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6750k;

/* JADX INFO: renamed from: com.google.android.material.datepicker.m */
/* JADX INFO: loaded from: classes2.dex */
class C4481m extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    private static final int f16890d = 4;

    /* JADX INFO: renamed from: a */
    private final Calendar f16891a;

    /* JADX INFO: renamed from: b */
    private final int f16892b;

    /* JADX INFO: renamed from: c */
    private final int f16893c;

    public C4481m() {
        Calendar calendarM20223m = AbstractC4466C.m20223m();
        this.f16891a = calendarM20223m;
        this.f16892b = calendarM20223m.getMaximum(7);
        this.f16893c = calendarM20223m.getFirstDayOfWeek();
    }

    /* JADX INFO: renamed from: b */
    private int m20306b(int i7) {
        int i8 = i7 + this.f16893c;
        int i9 = this.f16892b;
        return i8 > i9 ? i8 - i9 : i8;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i7) {
        if (i7 >= this.f16892b) {
            return null;
        }
        return Integer.valueOf(m20306b(i7));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f16892b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC6748i.f26473v, viewGroup, false);
        }
        this.f16891a.set(7, m20306b(i7));
        textView.setText(this.f16891a.getDisplayName(7, f16890d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(AbstractC6750k.f26522v), this.f16891a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C4481m(int i7) {
        Calendar calendarM20223m = AbstractC4466C.m20223m();
        this.f16891a = calendarM20223m;
        this.f16892b = calendarM20223m.getMaximum(7);
        this.f16893c = i7;
    }
}
