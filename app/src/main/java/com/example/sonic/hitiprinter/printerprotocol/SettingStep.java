package com.example.sonic.hitiprinter.printerprotocol;

public enum SettingStep {
    Step_Complete,
    Step_SendDataErrorDueToPrinter,
    Step_CheckPrintCompleteErrorDueToPrinter,
    Step_AuthenticationRequest,
    Step_AuthenticationResponse,
    Step_AuthenticationResponeForPWD,
    Step_GetNetworkInfoRequest,
    Step_GetNetworkInfoResponse,
    Step_GetNetworkInfoResponseSuccess,
    Step_RecoveryPrinterRequest,
    Step_RecoveryPrinterResponse,
    Step_GetProductIDRequest,
    Step_GetProductIDResponse,
    Step_GetProductIDResponseSuccess,
    Step_GetPrinterInfoRequest,
    Step_GetPrinterInfoResponse,
    Step_GetPrinterInfoResponseSuccess,
    Step_GetPrinterStatusRequest,
    Step_GetPrinterStatusResponse,
    Step_GetPrinterStatusResponseSuccess,
    Step_GetPrinterCapabilitiesRequest,
    Step_GetPrinterCapabilitiesResponse,
    Step_GetPrinterCapabilitiesResponseSuccess,
    Step_PrepareCreateJobRequest,
    Step_CreateJobRequest,
    Step_CreateJobResponse,
    Step_CreateJobResponseSuccess,
    Step_StartJobRequest,
    Step_StartJobResponse,
    Step_SendDataRequest,
    Step_SendDataResponse,
    Step_GetJobStatusRequest,
    Step_GetJobStatusResponse,
    Step_GetJobStatusResponseSuccess,
    Step_GetPrintFrameRequest,
    Step_GetPrintFrameResponse,
    Step_GetPrintFrameResponseSuccess,
    Step_CompleteDueToCheckError,
    Step_CompleteDueToSameVersion,
    Step_UpdateFirmwareRequest,
    Step_UpdateFirmwareResponse,
    Step_SetAutoPowerOffRequest,
    Step_SetAutoPowerOffResponse,
    Step_ConfigureNetworkSettingRequest,
    Step_ConfigureNetworkSettingResponse,
    Step_GetPrinterStatusErrorDueToPrinter,
    Step_GetRootRequest,
    Step_GetStorageIdRequest,
    Step_GetStorageIdResponse,
    Step_GetStorageIdResponseSuccess,
    Step_GetObjectHandleRequest,
    Step_GetObjectHandleResponse,
    Step_GetObjectHandleResponseSuccess,
    Step_GetObjectHandleForThumbnailIDRequest,
    Step_GetObjectHandleForThumbnailIDResponse,
    Step_GetObjectHandleForThumbnailIDResponseSuccess,
    Step_GetObjectInfoRequest,
    Step_GetObjectInfoResponse,
    Step_GetObjectInfoResponseSuccess,
    Step_GetThumbnailRequest,
    Step_GetThumbnailResponse,
    Step_GetThumbnailResponseSuccess,
    Step_GetImageRequest,
    Step_GetImageResponse,
    Step_GetImageResponseSuccess,
    Step_GetStorageInfoRequest,
    Step_GetStorageInfoResponse,
    Step_GetStorageInfoResponseSuccess,
    Step_PrintingCancel,
    Step_NoBorder,
    Step_GetPrinterCapabilitiesForConsumableRemainRequest,
    Step_GetPrinterCapabilitiesForConsumableRemainResponse,
    Step_GetPrinterCapabilitiesForConsumableRemainResponseSuccess,
    Step_GetJobStatusResponseSuccess_plus,
    Step_GetJobStatusResponse_plus,
    Step_GetObjectNumberRequest,
    Step_GetObjectNumberResponse,
    Step_GetObjectNumberResponseSuccess,
    Step_GetUnCleanNumberRequest,
    Step_GetUnCleanNumberResponse,
    Step_GetUnCleanNumberResponseSuccess,
    Step_CleanModeRunRequest,
    Step_CleanModeRunResponse,
    Step_CleanModeRunResponseSuccess,
    Step_PaperJamRunRequest,
    Step_PaperJamRunResponse,
    Step_PaperJamRunResponseSuccess,
    Step_Error,
    Step_TimeOutError
}
