package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import p338r0.AbstractC6873c;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: Z */
    private final Context f10546Z;

    /* JADX INFO: renamed from: a0 */
    private final ArrayAdapter f10547a0;

    /* JADX INFO: renamed from: b0 */
    private Spinner f10548b0;

    /* JADX INFO: renamed from: c0 */
    private final AdapterView.OnItemSelectedListener f10549c0;

    /* JADX INFO: renamed from: androidx.preference.DropDownPreference$a */
    class C2668a implements AdapterView.OnItemSelectedListener {
        C2668a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            if (i7 >= 0) {
                String string = DropDownPreference.this.m12723a0()[i7].toString();
                if (string.equals(DropDownPreference.this.m12724b0()) || !DropDownPreference.this.m12739c(string)) {
                    return;
                }
                DropDownPreference.this.m12725d0(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6873c.f27502c);
    }

    /* JADX INFO: renamed from: f0 */
    private void m12710f0() {
        this.f10547a0.clear();
        if (m12721Y() != null) {
            for (CharSequence charSequence : m12721Y()) {
                this.f10547a0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: B */
    protected void mo12711B() {
        super.mo12711B();
        ArrayAdapter arrayAdapter = this.f10547a0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: D */
    protected void mo12709D() {
        this.f10548b0.performClick();
    }

    /* JADX INFO: renamed from: e0 */
    protected ArrayAdapter m12712e0() {
        return new ArrayAdapter(this.f10546Z, R.layout.simple_spinner_dropdown_item);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10549c0 = new C2668a();
        this.f10546Z = context;
        this.f10547a0 = m12712e0();
        m12710f0();
    }
}
