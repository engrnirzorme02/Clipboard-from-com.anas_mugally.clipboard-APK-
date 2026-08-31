package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcl {
    public String zza;
    public String zzb;
    public String zzc;
    public List zzd;
    public List zze;
    public int zzf = 1;
    public int zzg;

    public zzcl() {
        List list = Collections.EMPTY_LIST;
        this.zzd = list;
        this.zze = list;
        this.zzg = 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x014a  */
    public static zzcl zza(JsonReader jsonReader) throws IOException {
        byte b7;
        byte b8;
        int i7;
        zzcl zzclVar = new zzcl();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i8 = 6;
            int i9 = 3;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    String strNextString = jsonReader.nextString();
                    switch (strNextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i8 = 1;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i8 = 2;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i8 = 3;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            i8 = 4;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i8 = 5;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            i8 = 7;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i8 = 8;
                            zzclVar.zzf = i8;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                    }
                    break;
                case "consent_form_payload":
                    zzclVar.zza = jsonReader.nextString();
                    break;
                case "consent_form_base_url":
                    zzclVar.zzb = jsonReader.nextString();
                    break;
                case "error_message":
                    zzclVar.zzc = jsonReader.nextString();
                    break;
                case "request_info_keys":
                    zzclVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzclVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case "actions":
                    zzclVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzck zzckVar = new zzck();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            int iHashCode = strNextName.hashCode();
                            if (iHashCode != -2105551094) {
                                if (iHashCode == 1583758243 && strNextName.equals("action_type")) {
                                    b7 = 0;
                                } else {
                                    b7 = -1;
                                }
                            } else if (strNextName.equals("args_json")) {
                                b7 = 1;
                            } else {
                                b7 = -1;
                            }
                            if (b7 == 0) {
                                String strNextString2 = jsonReader.nextString();
                                int iHashCode2 = strNextString2.hashCode();
                                if (iHashCode2 != 64208429) {
                                    if (iHashCode2 != 82862015) {
                                        if (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                            b8 = 0;
                                        } else {
                                            b8 = -1;
                                        }
                                    } else if (strNextString2.equals("WRITE")) {
                                        b8 = 1;
                                    } else {
                                        b8 = -1;
                                    }
                                } else if (strNextString2.equals("CLEAR")) {
                                    b8 = 2;
                                } else {
                                    b8 = -1;
                                }
                                if (b8 == 0) {
                                    i7 = 1;
                                } else if (b8 == 1) {
                                    i7 = 2;
                                } else {
                                    if (b8 != 2) {
                                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString2));
                                    }
                                    i7 = 3;
                                }
                                zzckVar.zzb = i7;
                            } else if (b7 != 1) {
                                jsonReader.skipValue();
                            } else {
                                zzckVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzclVar.zze.add(zzckVar);
                    }
                    jsonReader.endArray();
                    break;
                case "privacy_options_required":
                    String strNextString3 = jsonReader.nextString();
                    int iHashCode3 = strNextString3.hashCode();
                    if (iHashCode3 != -1888946261) {
                        if (iHashCode3 != 389487519) {
                            if (iHashCode3 == 433141802 && strNextString3.equals("UNKNOWN")) {
                            }
                        } else if (strNextString3.equals("REQUIRED")) {
                        }
                    } else if (strNextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r6 == 0) {
                        i9 = 1;
                    } else if (r6 == 1) {
                        i9 = 2;
                    } else if (r6 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString3));
                    }
                    zzclVar.zzg = i9;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzclVar;
    }
}
